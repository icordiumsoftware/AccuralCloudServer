package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.*;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rentalCartProduct")
public class RentalCartProductController {
    @Autowired
    private RentalCartProductService rentalCartProductService;
    @Autowired
    private BookingCartHedderService bookingCartHedderService;
    @Autowired
    private RentalPriceListService rentalPriceListService;
    @Autowired
    private ProductService productService;
    @Autowired
    private DailyStockService dailyStockService;

    @GetMapping("/all")
    public String allRentCartProduct() {
        try {
            JSONArray array = new JSONArray();
            for (RentcartproductEntity entity : rentalCartProductService.findAllCartProduct()) {
                JSONObject object = new JSONObject();
                ProductEntity productEntity = entity.getProductByProductIdproduct();
                object.put("idrentcartrentcartproduct", entity.getIdrentcartrentcartproduct());
                object.put("productIdproduct", entity.getProductIdproduct());
                object.put("code", productEntity.getProductcode());
                object.put("productDescription", productEntity.getDescription());
                object.put("qty", entity.getQty());
                object.put("freeqty", entity.getFreeqty());
                object.put("startdate", entity.getStartdate());
                object.put("enddate", entity.getEnddate());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("discount", entity.getDiscount());
                // Customer Code
                BookingcartEntity bookingcartEntity = bookingCartHedderService.findById(entity.getCartIdcart());

                long diff = bookingcartEntity.getEndDate().getTime() - bookingcartEntity.getStartDate().getTime();
                long dates = diff / (24 * 60 * 60 * 1000);
                object.put("daycount", dates);
                List<DailystockbookEntity> dailystockbookEntityList = dailyStockService.findByProductAndDateBetween(entity.getProductIdproduct(), bookingcartEntity.getLocationIdlocation(), bookingcartEntity.getStartDate(), bookingcartEntity.getEndDate());
                if (dailystockbookEntityList.size() >= 1) {
                    object.put("actualStock", dailystockbookEntityList.get(0).getActualstockqty());
                    object.put("orderQty", dailystockbookEntityList.get(0).getBookedorderqty());
                    object.put("receiveQty", dailystockbookEntityList.get(0).getTargetreciveqty());
                } else {
                    object.put("actualStock", 0);
                    object.put("orderQty", 0);
                    object.put("receiveQty", 0);
                }
                List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductIdproduct(), bookingcartEntity.getRentalpricecategoryIdrentalpricecategory(), dates);
                if (entityList.size() == 1) {
                    object.put("price", entityList.get(0).getRentalprice());
                    object.put("total", entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                } else {
                    object.put("price", "1010101010101010101010101010101");
                    object.put("total", "1010101010101010101010101010101");
                }
                // Customer Code
                array.put(object);
            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @GetMapping("/byCartid/{id}")
    public String allByRentCartProduct(@PathVariable String id) {
        try {
            JSONArray array = new JSONArray();
            for (RentcartproductEntity entity : rentalCartProductService.findByCartIdCartProduct(DataTypeValidator.parseInt(id))) {
                JSONObject object = new JSONObject();
                ProductEntity productEntity = entity.getProductByProductIdproduct();
                object.put("idrentcartrentcartproduct", entity.getIdrentcartrentcartproduct());
                object.put("productIdproduct", entity.getProductIdproduct());
                object.put("code", productEntity.getProductcode());
                object.put("productDescription", productEntity.getDescription());
                object.put("qty", entity.getQty());
                object.put("freeqty", entity.getFreeqty());
                object.put("startdate", entity.getStartdate());
                object.put("enddate", entity.getEnddate());
                object.put("cartIdcart", entity.getCartIdcart());
                object.put("discount", entity.getDiscount());
                // Customer Code
                BookingcartEntity bookingcartEntity = bookingCartHedderService.findById(entity.getCartIdcart());

                long diff = bookingcartEntity.getEndDate().getTime() - bookingcartEntity.getStartDate().getTime();
                long dates = diff / (24 * 60 * 60 * 1000);
                object.put("daycount", dates);
                List<DailystockbookEntity> dailystockbookEntityList = dailyStockService.findByProductAndDateBetween(entity.getProductIdproduct(), bookingcartEntity.getLocationIdlocation(), bookingcartEntity.getStartDate(), bookingcartEntity.getEndDate());
                if (dailystockbookEntityList.size() >= 1) {
                    object.put("actualStock", dailystockbookEntityList.get(0).getActualstockqty());
                    object.put("orderQty", dailystockbookEntityList.get(0).getBookedorderqty());
                    object.put("receiveQty", dailystockbookEntityList.get(0).getTargetreciveqty());
                } else {
                    object.put("actualStock", 0);
                    object.put("orderQty", 0);
                    object.put("receiveQty", 0);
                }
                List<RentalpricelistEntity> entityList = rentalPriceListService.findAllRentalPriceByProductIdAndRentalPriceCategoryAndDateqty(entity.getProductIdproduct(), bookingcartEntity.getRentalpricecategoryIdrentalpricecategory(), dates);
                if (entityList.size() == 1) {
                    object.put("price", entityList.get(0).getRentalprice());
                    object.put("total", entityList.get(0).getRentalprice() * dates * entity.getQty() - entity.getDiscount());
                } else {
                    object.put("price", "1010101010101010101010101010101");
                    object.put("total", "1010101010101010101010101010101");
                }
                // Customer Code
                array.put(object);

            }
            return array.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestBody RentcartproductEntity bookingcartEntity) {
        return rentalCartProductService.saveCartProduct(bookingcartEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestBody RentcartproductEntity rentcartproductEntity) {
        return rentalCartProductService.updateCartProduct(rentcartproductEntity);
    }

    @GetMapping("/find/{id}")
    public RentcartproductEntity getProductById(@PathVariable String id) {
        return rentalCartProductService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return rentalCartProductService.deleteById(DataTypeValidator.parseInt(id));
    }
}