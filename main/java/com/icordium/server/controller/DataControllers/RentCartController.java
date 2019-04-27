package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.TransactionTypes;
import com.icordium.server.controller.datamodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/RentCart")
public class RentCartController {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private TradeService tradeService;
    //
    @Autowired
    private BookingCartHedderService bookingCartHedderService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ServiceService serviceService;
    @Autowired
    private RentalBookingService rentalBookingService;
    @Autowired
    private BookingProductService bookingProductService;
    @Autowired
    private BookingServiceService bookingServiceService;
    @Autowired
    private BookingOtherService bookingOtherService;
    //
    @Autowired
    private RentalCartOtherService rentalCartOtherService;
    @Autowired
    private RentalCartServiceService rentalCartServiceService;
    @Autowired
    private RentalCartProductService rentalCartProductService;
    //
    @Autowired
    private DailyStockHistoryService dailyStockHistoryService;
    //
    @Autowired
    private DispatchRentOutedHedderService dispatchRentOutedHedderService;
    @Autowired
    private DispatchRentoutedDataProdductService dispatchRentoutedDataProdductService;
    @Autowired
    private DispatchRentoutedDataService dispatchRentoutedDataService;
    @Autowired
    private DispatchRentOutOtherService dispatchRentOutOtherService;


    @GetMapping("/all")
    public List<BookingcartEntity> allRentCart() {
        return bookingCartHedderService.findAllCartHedders();
    }

    @GetMapping("/bystatus/{status}")
    public List<BookingcartEntity> allRentCartByStatus(@PathVariable String status) {
        return bookingCartHedderService.findAllCartHeddersByStatus(DataTypeValidator.parseInt(status));
    }

    @GetMapping("/getCustomerbyCart/{id}")
    public CustomersEntity CustomerDetailRentCartBySId(@PathVariable String id) {
        BookingcartEntity bookingcartEntity = bookingCartHedderService.findById(DataTypeValidator.parseInt(id));
        return customerService.findById(bookingcartEntity.getCustomersIdcustomers());
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestBody BookingcartEntity bookingcartEntity) {
        return bookingCartHedderService.saveCartHedder(bookingcartEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestBody BookingcartEntity cartEntity) {
        return bookingCartHedderService.updateCartHedder(cartEntity);
    }

    @GetMapping("/find/{id}")
    public BookingcartEntity getProductById(@PathVariable String id) {
        return bookingCartHedderService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return bookingCartHedderService.deleteById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/CreateBookingByCart/{id}")
    public String CreateBookingCartById(HttpServletRequest httpServletRequest, @PathVariable String id) throws JSONException {
        try {
            if (!httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                int CartId = DataTypeValidator.parseInt(id);
                BookingcartEntity bookingcartEntity = bookingCartHedderService.findById(CartId);
                RentalbookingEntity rentalbookingEntity = new RentalbookingEntity();
                rentalbookingEntity.setCustomersIdcustomers(bookingcartEntity.getCustomersIdcustomers());
                rentalbookingEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                rentalbookingEntity.setDeliveryaddress(bookingcartEntity.getDiliveryAddress());
                rentalbookingEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                rentalbookingEntity.setDiliveerydate(new Timestamp(bookingcartEntity.getStartDate().getTime()));
                rentalbookingEntity.setReturndate(new Timestamp(bookingcartEntity.getEndDate().getTime()));
                rentalbookingEntity.setAdvanceamount(bookingcartEntity.getAdvanceamount());
                String hedder = rentalBookingService.saveCartHedder(rentalbookingEntity);
                JSONObject jsonObject = new JSONObject(hedder);
                int bookingID = DataTypeValidator.parseInt(jsonObject.get("id").toString());
                System.out.println(bookingID);

                TransactionEntity transactionEntity = new TransactionEntity();
                transactionEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                transactionEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                transactionEntity.setTransactiondescription(TransactionTypes.RentalOrderbookingCartTransactionDescription);
                transactionEntity.setTransactiontype(TransactionTypes.RentalOrderbookingCartTransactionCode + "");
                String transaction = transactionService.saveSystemTransaction(transactionEntity);
                JSONObject jsonObjectTransaction = new JSONObject(transaction);
                int TransactionID = DataTypeValidator.parseInt(jsonObjectTransaction.get("id").toString());

                if (bookingcartEntity.getAdvanceamount() > 0) {
                    TradeEntity tradeEntity = new TradeEntity();
                    tradeEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    tradeEntity.setUsersIdusers(bookingcartEntity.getUsersIdusers());
                    tradeEntity.setDate(new Timestamp(new Date().getTime()));
                    tradeEntity.setAccountno(bookingcartEntity.getCustomersIdcustomers());
                    tradeEntity.setAccountname(bookingcartEntity.getCustomersByCustomersIdcustomers().getSuffix() + " " + bookingcartEntity.getCustomersByCustomersIdcustomers().getFirstname() + " " + bookingcartEntity.getCustomersByCustomersIdcustomers().getLastname());
                    tradeEntity.setDescription("Customer Deposit");
                    tradeEntity.setType(25);
                    tradeEntity.setReferencetrade(TransactionID);
                    tradeEntity.setTransactionIdtransaction(TransactionID);
                    tradeEntity.setAmount(bookingcartEntity.getAdvanceamount());
                    tradeService.saveTrade(tradeEntity);
                }
                for (RentcartserviceEntity entity : rentalCartServiceService.findByCartIdCartService(CartId)) {
                    BookingserviceEntity bookingserviceEntity = new BookingserviceEntity();
                    bookingserviceEntity.setRentalbookingIdrentalbooking(bookingID);
                    bookingserviceEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    bookingserviceEntity.setServiceIdservice(entity.getServiceIdservice());
                    bookingserviceEntity.setDiscount(entity.getDiscount());
                    bookingserviceEntity.setQty(entity.getQty());
                    bookingserviceEntity.setFreeqty(entity.getFreeqty());
                    bookingServiceService.saveBookingService(bookingserviceEntity);
                }
                for (RentcartproductEntity entity : rentalCartProductService.findByCartIdCartProduct(CartId)) {
                    BookingproductEntity bookingproductEntity = new BookingproductEntity();
                    bookingproductEntity.setRentalbookingIdrentalbooking(bookingID);
                    bookingproductEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    bookingproductEntity.setProductIdproduct(entity.getProductIdproduct());
                    bookingproductEntity.setQty(entity.getQty());
                    bookingproductEntity.setFreeqty(entity.getFreeqty());
                    bookingproductEntity.setDiscount(entity.getDiscount());
                    bookingproductEntity.setStart(bookingcartEntity.getStartDate());
                    bookingproductEntity.setEnd(bookingcartEntity.getEndDate());
                    bookingProductService.saveBookingProduct(bookingproductEntity);
                    // Daily Stock Out Book Update
                    DailystockhistoryEntity dailystockOuthistoryEntity = new DailystockhistoryEntity();
                    dailystockOuthistoryEntity.setLocationIdlocation(rentalbookingEntity.getLocationIdlocation());
                    dailystockOuthistoryEntity.setType("Rent Out Invoice Start Date");
                    dailystockOuthistoryEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                    dailystockOuthistoryEntity.setDate(new java.sql.Date(bookingcartEntity.getStartDate().getTime()));
                    dailystockOuthistoryEntity.setActualdate(new java.sql.Date(bookingcartEntity.getStartDate().getTime()));
                    dailystockOuthistoryEntity.setProductIdproduct(entity.getProductIdproduct());
                    dailystockOuthistoryEntity.setOrderqty((entity.getQty() + entity.getFreeqty()));
                    dailystockOuthistoryEntity.setReviceqty(0.00);
                    dailystockOuthistoryEntity.setStockqty(0.00);
                    dailystockOuthistoryEntity.setId(TransactionID);
                    dailyStockHistoryService.saveDailyStockHistory(dailystockOuthistoryEntity);
                    // Daily Stock In Book Update
                    DailystockhistoryEntity dailystockInhistoryEntity = new DailystockhistoryEntity();
                    dailystockInhistoryEntity.setLocationIdlocation(rentalbookingEntity.getLocationIdlocation());
                    dailystockInhistoryEntity.setType("Rent Out Invoice End Date");
                    dailystockInhistoryEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                    dailystockInhistoryEntity.setDate(new java.sql.Date(bookingcartEntity.getEndDate().getTime()));
                    dailystockInhistoryEntity.setActualdate(new java.sql.Date(bookingcartEntity.getEndDate().getTime()));
                    dailystockInhistoryEntity.setProductIdproduct(entity.getProductIdproduct());
                    dailystockInhistoryEntity.setReviceqty((entity.getQty() + entity.getFreeqty()));
                    dailystockInhistoryEntity.setOrderqty(0.00);
                    dailystockInhistoryEntity.setStockqty(0.00);
                    dailystockInhistoryEntity.setId(TransactionID);
                    dailyStockHistoryService.saveDailyStockHistory(dailystockOuthistoryEntity);
                }
                for (RentcartotherEntity entity : rentalCartOtherService.findByCartCartOthers(CartId)) {
                    RentalotherEntity rentalotherEntity = new RentalotherEntity();
                    rentalotherEntity.setRentalbookingIdrentalbooking(bookingID);
                    rentalotherEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    rentalotherEntity.setOtherdescription(entity.getDescription());
                    rentalotherEntity.setPrice(entity.getPrice());
                    rentalotherEntity.setQty(entity.getQty());
                    rentalotherEntity.setFreeqty(entity.getFreeqty());
                    bookingOtherService.saveBookingOther(rentalotherEntity);
                }
                bookingcartEntity.setCartstatus(2);
                bookingCartHedderService.updateCartHedder(bookingcartEntity);
                return hedder;
            } else {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return "{\"status\":\"error\"}";
        }
    }

    @PostMapping("/CreateBookingRentalInvoiceCartById/{id}")
    public String CreateBookingRentalInvoiceCartById(HttpServletRequest httpServletRequest, @PathVariable String id) throws JSONException {
        try {
            if (!httpServletRequest.getSession().getAttribute("userid").equals(null)) {
                int CartId = DataTypeValidator.parseInt(id);
                BookingcartEntity bookingcartEntity = bookingCartHedderService.findById(CartId);

//                RentalbookingEntity rentalbookingEntity = new RentalbookingEntity();
//                rentalbookingEntity.setCustomersIdcustomers(bookingcartEntity.getCustomersIdcustomers());
//                rentalbookingEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
//                rentalbookingEntity.setDeliveryaddress(bookingcartEntity.getDiliveryAddress());
//                rentalbookingEntity.setRegdatetime(new Timestamp(new Date().getTime()));
//                rentalbookingEntity.setDiliveerydate(new Timestamp(bookingcartEntity.getStartDate().getTime()));
//
//                String hedder = rentalBookingService.saveCartHedder(rentalbookingEntity);
//                JSONObject jsonObject=new JSONObject(hedder);
//                int bookingID = DataTypeValidator.parseInt(jsonObject.get("id").toString());
//                System.out.println(bookingID);
                // Create Transaction
                TransactionEntity transactionEntity = new TransactionEntity();
                transactionEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                transactionEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                transactionEntity.setTransactiondescription(TransactionTypes.RentalInvoiceCartTransactionDescription);
                transactionEntity.setTransactiontype(TransactionTypes.RentalInvoiceCartTransactionCode + "");
                String transaction = transactionService.saveSystemTransaction(transactionEntity);
                JSONObject jsonObjectTransaction = new JSONObject(transaction);
                int TransactionID = DataTypeValidator.parseInt(jsonObjectTransaction.get("id").toString());
                System.out.println(TransactionID);
                //End Creation Transaction

                if (!bookingcartEntity.getAdvanceamount().isNaN() && bookingcartEntity.getAdvanceamount() > 0) {
                    TradeEntity tradeEntity = new TradeEntity();
                    tradeEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    tradeEntity.setUsersIdusers(bookingcartEntity.getUsersIdusers());
                    tradeEntity.setDate(new Timestamp(new Date().getTime()));
                    tradeEntity.setAccountno(bookingcartEntity.getCustomersIdcustomers());
                    tradeEntity.setAccountname(bookingcartEntity.getCustomersByCustomersIdcustomers().getSuffix() + " " + bookingcartEntity.getCustomersByCustomersIdcustomers().getFirstname() + " " + bookingcartEntity.getCustomersByCustomersIdcustomers().getLastname());
                    tradeEntity.setDescription("Customer Deposit");
                    tradeEntity.setType(25);
                    tradeEntity.setReferencetrade(TransactionID);
                    tradeEntity.setTransactionIdtransaction(TransactionID);
                    tradeEntity.setAmount(bookingcartEntity.getAdvanceamount());
                    tradeService.saveTrade(tradeEntity);
                }
                // Create Renout Hedder
                RentoutedhedderEntity rentoutedhedderEntity = new RentoutedhedderEntity();
                rentoutedhedderEntity.setCustomersIdcustomers(bookingcartEntity.getCustomersIdcustomers());
                rentoutedhedderEntity.setUsersIdusers(bookingcartEntity.getUsersIdusers());
                rentoutedhedderEntity.setStatus(1);
                rentoutedhedderEntity.setDiliverydatetime(new Timestamp(bookingcartEntity.getStartDate().getTime()));
                rentoutedhedderEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                rentoutedhedderEntity.setReturndatetime(new Timestamp(bookingcartEntity.getEndDate().getTime()));
                rentoutedhedderEntity.setDiliveryaddress(bookingcartEntity.getDiliveryAddress());
                rentoutedhedderEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                rentoutedhedderEntity.setTransactionIdtransaction(TransactionID);
                rentoutedhedderEntity.setRentalpricecategoryIdrentalpricecategory(bookingcartEntity.getRentalpricecategoryIdrentalpricecategory());
                rentoutedhedderEntity.setAdvanceamount(bookingcartEntity.getAdvanceamount());
                rentoutedhedderEntity.setWorkshiftIdworkshift(DataTypeValidator.parseInt(httpServletRequest.getSession().getAttribute("WorkShiftID")));
                String saveRentoutedhedder = dispatchRentOutedHedderService.saveRentoutedhedders(rentoutedhedderEntity);
                JSONObject jsonObjectRentoutedhedder = new JSONObject(saveRentoutedhedder);
                int RentoutHedderID = DataTypeValidator.parseInt(jsonObjectRentoutedhedder.get("id").toString());
                System.out.println(RentoutHedderID);
                // End Rentout Hedder

                for (RentcartserviceEntity entity : bookingcartEntity.getRentcartservicesByBookingcart()) {
//                    BookingserviceEntity bookingserviceEntity = new BookingserviceEntity();
//                    bookingserviceEntity.setRentalbookingIdrentalbooking(bookingID);
//                    bookingserviceEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
//                    bookingserviceEntity.setServiceIdservice(entity.getServiceIdservice());
//                    bookingserviceEntity.setDiscount(entity.getDiscount());
//                    bookingserviceEntity.setQty(entity.getQty());
//                    bookingserviceEntity.setFreeqty(entity.getFreeqty());
//                    bookingServiceService.saveBookingService(bookingserviceEntity);

                    // Rent Out Service
                    RentoutservicedataEntity rentoutservicedataEntity = new RentoutservicedataEntity();
                    ServiceEntity serviceEntity = entity.getServiceByServiceIdservice();
                    rentoutservicedataEntity.setRentoutedhedderIdrentoutedhedder(RentoutHedderID);
                    rentoutservicedataEntity.setServiceIdservice(entity.getServiceIdservice());
                    rentoutservicedataEntity.setCostprice(serviceEntity.getCostprice());
                    rentoutservicedataEntity.setPrice(serviceEntity.getRetailprice());
                    rentoutservicedataEntity.setQty(entity.getQty());
                    rentoutservicedataEntity.setFreeqty(entity.getFreeqty());
                    rentoutservicedataEntity.setIsinvoiced(0);
                    rentoutservicedataEntity.setDiscount(entity.getDiscount());
                    dispatchRentoutedDataService.saveRentoutedDataService(rentoutservicedataEntity);

                }
                for (RentcartproductEntity entity : bookingcartEntity.getRentcartproductsByBookingcart()) {
//                    BookingproductEntity bookingproductEntity = new BookingproductEntity();
//                    bookingproductEntity.setRentalbookingIdrentalbooking(bookingID);
//                    bookingproductEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
//                    bookingproductEntity.setProductIdproduct(entity.getProductIdproduct());
//                    bookingproductEntity.setQty(entity.getQty());
//                    bookingproductEntity.setFreeqty(entity.getFreeqty());
//                    bookingproductEntity.setDiscount(entity.getDiscount());
//                    bookingproductEntity.setStart(bookingcartEntity.getStartDate());
//                    bookingproductEntity.setEnd(bookingcartEntity.getEndDate());
//                    bookingProductService.saveBookingProduct(bookingproductEntity);
                    // Save Rentouted Dataproduct
                    RentoutedproductdataEntity rentoutedproductdataEntity = new RentoutedproductdataEntity();
                    rentoutedproductdataEntity.setHedderIdrentoutedhedder(RentoutHedderID);
                    rentoutedproductdataEntity.setRentalpricecategoryIdrentalpricecategory(bookingcartEntity.getRentalpricecategoryIdrentalpricecategory());
                    rentoutedproductdataEntity.setProductidproduct(entity.getProductIdproduct());
                    rentoutedproductdataEntity.setDilivereddatetime(new Timestamp(bookingcartEntity.getStartDate().getTime()));
                    rentoutedproductdataEntity.setReturndatetime(new Timestamp(bookingcartEntity.getEndDate().getTime()));
                    rentoutedproductdataEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                    rentoutedproductdataEntity.setQty(entity.getQty());
                    rentoutedproductdataEntity.setFreeqty(entity.getFreeqty());
                    rentoutedproductdataEntity.setSetofffreeqty(0.00);
                    rentoutedproductdataEntity.setSetoffqty(0.00);
                    rentoutedproductdataEntity.setIsinvoiced(0);
                    rentoutedproductdataEntity.setDiscount(entity.getDiscount());
                    dispatchRentoutedDataProdductService.saveRentoutedproductdata(rentoutedproductdataEntity);
                    // Daily Stock Out Book Update
                    DailystockhistoryEntity dailystockOuthistoryEntity = new DailystockhistoryEntity();
                    dailystockOuthistoryEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    dailystockOuthistoryEntity.setType("Rent Out Invoice Start Date");
                    dailystockOuthistoryEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                    dailystockOuthistoryEntity.setDate(new java.sql.Date(bookingcartEntity.getStartDate().getTime()));
                    dailystockOuthistoryEntity.setActualdate(new java.sql.Date(bookingcartEntity.getStartDate().getTime()));
                    dailystockOuthistoryEntity.setProductIdproduct(entity.getProductIdproduct());
                    dailystockOuthistoryEntity.setStockqty(-1 * (entity.getQty() + entity.getFreeqty()));
                    dailystockOuthistoryEntity.setReviceqty(0.00);
                    dailystockOuthistoryEntity.setOrderqty(0.00);
                    dailystockOuthistoryEntity.setId(TransactionID);
                    dailyStockHistoryService.saveDailyStockHistory(dailystockOuthistoryEntity);
                    // Daily Stock In Book Update
                    DailystockhistoryEntity dailystockInhistoryEntity = new DailystockhistoryEntity();
                    dailystockInhistoryEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
                    dailystockInhistoryEntity.setType("Rent Out Invoice End Date");
                    dailystockInhistoryEntity.setRegdatetime(new Timestamp(new Date().getTime()));
                    dailystockInhistoryEntity.setDate(new java.sql.Date(bookingcartEntity.getEndDate().getTime()));
                    dailystockInhistoryEntity.setActualdate(new java.sql.Date(bookingcartEntity.getEndDate().getTime()));
                    dailystockInhistoryEntity.setProductIdproduct(entity.getProductIdproduct());
                    dailystockInhistoryEntity.setReviceqty((entity.getQty() + entity.getFreeqty()));
                    dailystockInhistoryEntity.setStockqty(0.00);
                    dailystockInhistoryEntity.setOrderqty(0.00);
                    dailyStockHistoryService.saveDailyStockHistory(dailystockOuthistoryEntity);
                }
                for (RentcartotherEntity entity : rentalCartOtherService.findByCartCartOthers(CartId)) {
//                    RentalotherEntity rentalotherEntity = new RentalotherEntity();
//                    rentalotherEntity.setRentalbookingIdrentalbooking(bookingID);
//                    rentalotherEntity.setLocationIdlocation(bookingcartEntity.getLocationIdlocation());
//                    rentalotherEntity.setOtherdescription(entity.getDescription());
//                    rentalotherEntity.setPrice(entity.getPrice());
//                    rentalotherEntity.setQty(entity.getQty());
//                    rentalotherEntity.setFreeqty(entity.getFreeqty());
//                    bookingOtherService.saveBookingOther(rentalotherEntity);
                    // Rent Out Other Invoice
                    RentoutedotherEntity rentoutedotherEntity = new RentoutedotherEntity();
                    rentoutedotherEntity.setRentoutedhedderIdrentoutedhedder(RentoutHedderID);
                    rentoutedotherEntity.setDescription(entity.getDescription());
                    rentoutedotherEntity.setRate(entity.getPrice());
                    rentoutedotherEntity.setQty(entity.getQty());
                    rentoutedotherEntity.setFreeqty(entity.getFreeqty());
                    rentoutedotherEntity.setIsinvoiced(0);
                    dispatchRentOutOtherService.saveRentoutedother(rentoutedotherEntity);

                }
                bookingcartEntity.setCartstatus(2);
                bookingCartHedderService.updateCartHedder(bookingcartEntity);
                return saveRentoutedhedder;
            } else {
                return "{\"status\":\"error\"}";
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return "{\"status\":\"error\"}";
        }
    }
}