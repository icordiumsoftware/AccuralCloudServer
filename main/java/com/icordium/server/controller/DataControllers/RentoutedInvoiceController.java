package com.icordium.server.controller.DataControllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.icordium.server.controller.CustomResultDTO.RentOutedProductItem;
import com.icordium.server.controller.CustomResultDTO.RentalInvoiceingCreatingRequest;
import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.TransactionTypes;
import com.icordium.server.controller.datamodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("renntoutedinvoice")
public class RentoutedInvoiceController {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/DD");
    @Autowired
    private DispatchRentOutedHedderService dispatchRentOutedHedderService;
    @Autowired
    private RentalPriceListService rentalPriceListService;
    @Autowired
    private DispatchRentoutedDataService dispatchRentoutedDataService;
    @Autowired
    private DispatchRentOutOtherService dispatchRentOutOtherService;
    @Autowired
    private DispatchRentoutedDataProdductService dispatchRentoutedDataProdductService;
    @Autowired
    private RentalInvoiceHeddderService rentalInvoiceHeddderService;
    @Autowired
    private RentalInvoiceServiceDataService rentalInvoiceServiceDataService;
    @Autowired
    private RentalInvoiceOtherService rentalInvoiceOtherService;
    @Autowired
    private RentalInnvoiceDataProductService rentalInnvoiceDataProductService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private DailyStockHistoryService dailyStockHistoryService;

    @GetMapping("/location/{locationIdlocation}/ByDate/{sdate}/{edate}")
    public List<RentalinvoiceEntity> allInvoiceByDates(@PathVariable("locationIdlocation") int idLocation, @PathVariable("sdate") String SDate, @PathVariable("edate") String EDate) {
        return rentalInvoiceHeddderService.findAllRentalinvoiceByLocationAndDate(idLocation, SDate, EDate);
    }


    @GetMapping("/byId/{id}")
    String getallRentoutedInvoice(@PathVariable int id) {
        try {
            JSONObject object = new JSONObject();
            RentoutedhedderEntity entity = dispatchRentOutedHedderService.findById(id);
            object.put("idrentoutedhedder", entity.getIdrentoutedhedder());
            object.put("note", entity.getNote());
            object.put("regdatetime", entity.getRegdatetime());
            object.put("Advancepayment", entity.getAdvanceamount());
            object.put("diliverydatetime", entity.getDiliverydatetime());
            object.put("returndatetime", entity.getReturndatetime());
            object.put("locationIdlocation", entity.getLocationIdlocation());
            object.put("transactionIdtransaction", entity.getTransactionIdtransaction());
            object.put("usersIdusers", entity.getUsersIdusers());
            object.put("customersIdcustomers", entity.getCustomersIdcustomers());
            object.put("customersName", entity.getCustomersByCustomersIdcustomers().getSuffix() + " " + entity.getCustomersByCustomersIdcustomers().getFirstname() + " " + entity.getCustomersByCustomersIdcustomers().getLastname());
            object.put("status", entity.getStatus());
            object.put("diliveryaddress", entity.getDiliveryaddress());
            object.put("today", new Date().getTime());
            object.put("rentalpricecategoryIdrentalpricecategory", entity.getRentalpricecategoryIdrentalpricecategory());
            object.put("rentalpricecategoryName", entity.getRentalpricecategoryByRentalpricecategoryIdrentalpricecategory().getRentalpricecategoryname());
            return object.toString();
        } catch (Exception r) {
            return r.getMessage();
        }
    }

    @GetMapping("/ProductbyId/{id}/{dates}")
    String getallProductRentoutedInvoice(@PathVariable("id") int id, @PathVariable("dates") double dates) {
        try {
            JSONArray array = new JSONArray();
            Collection<RentoutedproductdataEntity> entities = dispatchRentOutedHedderService.findById(id).getRentoutedproductdatasByIdrentoutedhedder();
            for (RentoutedproductdataEntity entity :
                    entities) {
                if (entity.getIsinvoiced() == 0) {

                    JSONObject object = new JSONObject();
                    object.put("idrentoutedproductdata", entity.getIdrentoutedproductdata());
                    object.put("hedderIdrentoutedhedder", entity.getHedderIdrentoutedhedder());
                    object.put("dilivereddatetime", entity.getDilivereddatetime());
                    object.put("returndatetime", entity.getReturndatetime());
                    object.put("regdatetime", entity.getRegdatetime());
                    object.put("qty", entity.getQty());
                    object.put("freeqty", entity.getFreeqty());
                    object.put("setoffqty", entity.getSetoffqty());
                    object.put("setofffreeqty", entity.getSetofffreeqty());
                    object.put("balanceqty", entity.getQty() - entity.getSetoffqty());
                    object.put("balancefreeqty", entity.getFreeqty() - entity.getSetofffreeqty());
                    object.put("discount", entity.getDiscount());
                    object.put("productidproduct", entity.getProductidproduct());
                    object.put("productCode", entity.getProductByProductidproduct().getProductcode());
                    object.put("productDescription", entity.getProductByProductidproduct().getDescription());
                    object.put("rentalpricecategoryIdrentalpricecategory", entity.getRentalpricecategoryIdrentalpricecategory());

                    object.put("daycount", dates);
                    List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductidproduct(), entity.getRentoutedhedderByHedderIdrentoutedhedder().getRentalpricecategoryIdrentalpricecategory(), dates);
                    if (entityList.size() == 1) {
                        object.put("price", entityList.get(0).getRentalprice());
                        object.put("total", entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                    } else {
                        object.put("price", "1010101010101010101010101010101");
                        object.put("total", "1010101010101010101010101010101");
                    }
                    array.put(object);
                }
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @GetMapping("/ServicebyId/{id}")
    String getallServiceRentoutedInvoice(@PathVariable int id) {
        try {
            JSONArray array = new JSONArray();
            Collection<RentoutservicedataEntity> entities = dispatchRentOutedHedderService.findById(id).getRentoutservicedatasByIdrentoutedhedder();
            for (RentoutservicedataEntity entity : entities) {
                if (0 == entity.getIsinvoiced()) {
                    JSONObject object = new JSONObject();
                    object.put("idrentoutservicedata", entity.getIdrentoutservicedata());
                    object.put("rentoutedhedderIdrentoutedhedder", entity.getRentoutedhedderIdrentoutedhedder());
                    object.put("serviceIdservice", entity.getServiceIdservice());
                    object.put("serviceDescription", entity.getServiceByServiceIdservice().getServicename());
                    object.put("costprice", entity.getCostprice());
                    object.put("price", entity.getPrice());
                    object.put("qty", entity.getQty());
                    object.put("freeqty", entity.getFreeqty());
                    object.put("discount", entity.getDiscount());
                    object.put("total", (entity.getQty() * entity.getPrice()) - entity.getDiscount());
                    array.put(object);
                }
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @GetMapping("/OtherbyId/{id}")
    String getallOtherRentoutedInvoice(@PathVariable int id) {
        try {
            JSONArray array = new JSONArray();
            Collection<RentoutedotherEntity> entities = dispatchRentOutedHedderService.findById(id).getRentoutedothersByIdrentoutedhedder();
            for (RentoutedotherEntity entity :
                    entities) {
                if (0 == entity.getIsinvoiced()) {
                    JSONObject object = new JSONObject();
                    object.put("idrentoutedother", entity.getIdrentoutedother());
                    object.put("rentoutedhedderIdrentoutedhedder", entity.getRentoutedhedderIdrentoutedhedder());
                    object.put("description", entity.getDescription());
                    object.put("qty", entity.getQty());
                    object.put("freeqty", entity.getFreeqty());
                    object.put("rate", entity.getRate());
                    object.put("total", (entity.getQty() * entity.getRate()));
                    array.put(object);
                }
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @RequestMapping(value = "/RentoutalInvoicing", method = RequestMethod.POST)
    String RentoutalInvoicing(@RequestBody String jsonString, HttpServletRequest request) throws JSONException, IOException {
        double costtotal = 0;
        int productrowcount = 0;
        double totalamount = 0;
        boolean saveStatus = true;
        boolean FinsihRenoutedStatus = true;
        String ErrorCode = "";
        System.out.println("id--" + jsonString);
        ObjectMapper objectMapper = new ObjectMapper();
        RentalInvoiceingCreatingRequest rentalInvoiceingCreatingRequest = objectMapper.readValue(jsonString, RentalInvoiceingCreatingRequest.class);
        int workperiodId = DataTypeValidator.parseInt(request.getSession().getAttribute("WorkShiftID"));
        System.out.println("id--" + rentalInvoiceingCreatingRequest.getRentalRentoutedInvoice());
        RentoutedhedderEntity rentoutedhedderEntity = dispatchRentOutedHedderService.findById(DataTypeValidator.parseInt(rentalInvoiceingCreatingRequest.getRentalRentoutedInvoice()));
        Date startDate = rentalInvoiceingCreatingRequest.getStartDate();
        Date endDate = rentalInvoiceingCreatingRequest.getEndDate();
        long dayscount = (endDate.getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000);
        //         Set Close Invoice
        rentoutedhedderEntity.setStatus(2);
        //         Set Close Invoice
// Create New Transaction
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setLocationIdlocation(rentoutedhedderEntity.getLocationIdlocation());
        transactionEntity.setTransactiontype(TransactionTypes.RentalInvoiceTransactionCode + "");
        transactionEntity.setTransactiondescription(TransactionTypes.RentalInvoiceTransactionDescription);
        transactionEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        String transaction = transactionService.saveSystemTransaction(transactionEntity);
        JSONObject transactionJSON = new JSONObject(transaction);
        int trasactionID = DataTypeValidator.parseInt(transactionJSON.get("id").toString());
// End New Transaction
        System.out.println("transaction" + trasactionID);
        // Rental Invoice Hedder
        RentalinvoiceEntity rentalinvoiceEntity = new RentalinvoiceEntity();
        rentalinvoiceEntity.setRentoutedhedderIdrentoutedhedder(DataTypeValidator.parseInt(rentalInvoiceingCreatingRequest.getRentalRentoutedInvoice()));
        rentalinvoiceEntity.setWorkshiftIdworkshift(workperiodId);
        rentalinvoiceEntity.setStartdate(new java.sql.Date(rentalInvoiceingCreatingRequest.getStartDate().getTime()));
        rentalinvoiceEntity.setEnddate(new java.sql.Date(rentalInvoiceingCreatingRequest.getEndDate().getTime()));
        rentalinvoiceEntity.setLocationIdlocation(rentoutedhedderEntity.getLocationIdlocation());
        rentalinvoiceEntity.setRegdatetime(new Timestamp(new Date().getTime()));
        rentalinvoiceEntity.setCustomersIdcustomers(rentoutedhedderEntity.getCustomersIdcustomers());
        rentalinvoiceEntity.setTransactionIdtransaction(trasactionID);
        rentalinvoiceEntity.setDiscount(rentalInvoiceingCreatingRequest.getDiscount());
        rentalinvoiceEntity.setAdvanceamount(rentalInvoiceingCreatingRequest.getAmount());
        rentalinvoiceEntity.setGrossamount(rentalInvoiceingCreatingRequest.getAmount() + rentalInvoiceingCreatingRequest.getDiscount());
        String saveRentalinvoice = rentalInvoiceHeddderService.saveRentalinvoice(rentalinvoiceEntity);
        JSONObject jsonObjectRentoutedhedder = new JSONObject(saveRentalinvoice);
        int rentalInvoicID = (DataTypeValidator.parseInt(jsonObjectRentoutedhedder.get("id").toString()));
        // Rental Data Product

        for (RentoutedproductdataEntity entity : rentoutedhedderEntity.getRentoutedproductdatasByIdrentoutedhedder()) {
            for (RentOutedProductItem productItem :
                    rentalInvoiceingCreatingRequest.getRentOutedProductItems()) {
                if (entity.getIdrentoutedproductdata() == productItem.getId()) {
                    // Search Rental Price
                    List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductidproduct(), rentoutedhedderEntity.getRentalpricecategoryIdrentalpricecategory(), dayscount);
                    if (entityList.size() == 1) {
                        double rentalprice = entityList.get(0).getRentalprice();
                        double Total = entityList.get(0).getRentalprice() * dayscount * entity.getQty() - entity.getDiscount();
                        // End Srach Rental Price

                        //set update invoiced row
                        if ((entity.getQty() == entity.getSetoffqty() + productItem.getQty()) & (entity.getFreeqty() == entity.getSetofffreeqty() + productItem.getFreeqty())) {
                            productrowcount++;
                        } else {
                            rentoutedhedderEntity.setStatus(1);
                        }
                        entity.setSetoffqty(entity.getQty() + productItem.getQty());
                        entity.setSetofffreeqty(entity.getFreeqty() + productItem.getFreeqty());
                        dispatchRentoutedDataProdductService.updateRentoutedproductdata(entity);
                        RentalinvoicedattaproductEntity rentalinvoicedattaproductEntity = new RentalinvoicedattaproductEntity();
                        rentalinvoicedattaproductEntity.setRentalinvoiceIdrentalinvoice(rentalInvoicID);
                        rentalinvoicedattaproductEntity.setProductIdproduct(productItem.getProductid());
                        rentalinvoicedattaproductEntity.setPrice(rentalprice);
                        rentalinvoicedattaproductEntity.setRentaldate(new Timestamp(rentalInvoiceingCreatingRequest.getStartDate().getTime()));
                        rentalinvoicedattaproductEntity.setReturndate(new Timestamp(rentalInvoiceingCreatingRequest.getEndDate().getTime()));
                        rentalinvoicedattaproductEntity.setQty(productItem.getQty());
                        rentalinvoicedattaproductEntity.setFreeqty(productItem.getFreeqty());
                        rentalinvoicedattaproductEntity.setDaycount(Double.valueOf(dayscount));
                        rentalinvoicedattaproductEntity.setCosttotal(0.00);
                        rentalinvoicedattaproductEntity.setDiscount(productItem.getDiscount());
                        rentalinvoicedattaproductEntity.setAmount(Total);
                        rentalInnvoiceDataProductService.saveRentalDataProduct(rentalinvoicedattaproductEntity);
                        totalamount = +Total;
                        // Daily Stock Management
                        DailystockhistoryEntity dailystockhistoryEntity = new DailystockhistoryEntity();
                        dailystockhistoryEntity.setProductIdproduct(entity.getProductidproduct());
                        dailystockhistoryEntity.setActualdate(new java.sql.Date(new Date().getTime()));
                        dailystockhistoryEntity.setDate(new java.sql.Date(rentoutedhedderEntity.getReturndatetime().getTime()));
                        dailystockhistoryEntity.setReviceqty(-1 * entity.getQty() + entity.getFreeqty());
                        dailystockhistoryEntity.setLocationIdlocation(rentoutedhedderEntity.getLocationIdlocation());
                        dailystockhistoryEntity.setStockqty(entity.getQty() + entity.getFreeqty());
                        dailystockhistoryEntity.setType(TransactionTypes.RentalInvoiceTransactionDescription);
                        dailyStockHistoryService.saveDailyStockHistory(dailystockhistoryEntity);
                        // Daily Stock Management
                    } else {
                        saveStatus = false;
                        ErrorCode = "404 of Price";
                        break;
                    }
                }
            }
        }
// Check All Rows are settofed
        if (productrowcount != rentoutedhedderEntity.getRentoutedproductdatasByIdrentoutedhedder().size()) {
            rentoutedhedderEntity.setStatus(1);
        }
// Check All Rows are settofed

/// Save Service
        for (RentoutservicedataEntity entity :
                rentoutedhedderEntity.getRentoutservicedatasByIdrentoutedhedder()) {
            RentalservicedataEntity rentalservicedataEntity = new RentalservicedataEntity();
            rentalservicedataEntity.setRentalinvoiceIdrentalinvoice(rentalInvoicID);
            rentalservicedataEntity.setServiceIdservice(entity.getServiceIdservice());
            rentalservicedataEntity.setRentaldate(new Timestamp(startDate.getTime()));
            rentalservicedataEntity.setReturndate(new Timestamp(endDate.getTime()));
            rentalservicedataEntity.setPrice(entity.getPrice());
            rentalservicedataEntity.setCosttotal(entity.getCostprice() * entity.getQty());
            rentalservicedataEntity.setDiscount(entity.getDiscount());
            rentalservicedataEntity.setQty(entity.getQty());
            rentalservicedataEntity.setFreeqty(entity.getFreeqty());
            double Total = entity.getPrice() * entity.getQty() - entity.getDiscount();
            rentalservicedataEntity.setAmount(Total);
            entity.setIsinvoiced(1);
            dispatchRentoutedDataService.updateRentoutedDataService(entity);
            totalamount = +Total;
            costtotal = +entity.getCostprice() * entity.getQty();
        }
// End Save Service

// Start Save Other

        for (RentoutedotherEntity entity :
                rentoutedhedderEntity.getRentoutedothersByIdrentoutedhedder()) {
            RentalinvoiceotherEntity rentalinvoiceotherEntity = new RentalinvoiceotherEntity();
            rentalinvoiceotherEntity.setRentalinvoiceIdrentalinvoice(rentalInvoicID);
            rentalinvoiceotherEntity.setQty(entity.getQty());
            rentalinvoiceotherEntity.setFreeqty(entity.getFreeqty());
            rentalinvoiceotherEntity.setDescription(entity.getDescription());
            rentalinvoiceotherEntity.setPrice(entity.getRate());
            rentalinvoiceotherEntity.setDiscount(0.00);
            rentalinvoiceotherEntity.setAmount(entity.getRate() * entity.getQty());
            entity.setIsinvoiced(1);
            dispatchRentOutOtherService.updateRentoutedother(entity);
            rentalInvoiceOtherService.saveRentalinvoice(rentalinvoiceotherEntity);
            totalamount += entity.getRate() * entity.getQty();
        }

        rentalinvoiceEntity.setAmount(totalamount);
        rentalinvoiceEntity.setDiscount(rentalinvoiceEntity.getDiscount());
        rentalinvoiceEntity.setCosttotal(costtotal);
        dispatchRentOutedHedderService.updateRentoutedhedders(rentoutedhedderEntity);
        rentalInvoiceHeddderService.updateRentalinvoice(rentalinvoiceEntity);
//
        JSONObject object = new JSONObject();
        object.put("id", rentalInvoicID);
        return object.toString();
    }

    @RequestMapping(value = "/Otheradd", method = RequestMethod.POST)
    String saveOtherRentoutedInvoice(@RequestBody RentoutedotherEntity rentoutedotherEntity) {
        rentoutedotherEntity.setIsinvoiced(0);
        return dispatchRentOutOtherService.saveRentoutedother(rentoutedotherEntity);
    }

    @RequestMapping(value = "/Serviceadd", method = RequestMethod.POST)
    String saveserviceRentoutedInvoice(@RequestBody RentoutservicedataEntity rentoutservicedataEntity) {
        rentoutservicedataEntity.setIsinvoiced(0);
        return dispatchRentoutedDataService.saveRentoutedDataService(rentoutservicedataEntity);
    }

    @RequestMapping(value = "/Otherupdate", method = RequestMethod.POST)
    String updateOtherRentoutedInvoice(@RequestBody RentoutedotherEntity rentoutedotherEntity) {
        rentoutedotherEntity.setIsinvoiced(0);
        return dispatchRentOutOtherService.updateRentoutedother(rentoutedotherEntity);
    }

    @RequestMapping(value = "/Serviceupdate", method = RequestMethod.POST)
    String updateserviceRentoutedInvoice(@RequestBody RentoutservicedataEntity rentoutservicedataEntity) {
        rentoutservicedataEntity.setIsinvoiced(0);
        return dispatchRentoutedDataService.updateRentoutedDataService(rentoutservicedataEntity);
    }

    @RequestMapping(value = "/OtherDelete/{id}", method = RequestMethod.POST)
    String updateOtherRentoutedInvoice(@PathVariable int id) {
        return dispatchRentOutOtherService.deleteById(id);
    }

    @RequestMapping(value = "/ServiceDelete/{id}", method = RequestMethod.POST)
    String updateserviceRentoutedInvoice(@PathVariable int id) {
        return dispatchRentoutedDataService.deleteById(id);
    }

    @RequestMapping(value = "/CancelrentoutedInvoice/{id}", method = RequestMethod.POST)
    String CancelRentoutedInvoice(@PathVariable int id) {
        return dispatchRentoutedDataService.deleteById(id);
    }

    @GetMapping("/all")
    List<RentoutedhedderEntity> slist() {
        return dispatchRentOutedHedderService.findAllRentoutedhedders();
    }
}