package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.ProductService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<ProductEntity> allProducts() {
        return productService.findAllProducts();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newproductImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        ProductEntity productEntity = new ProductEntity();
        String Pathdb = "/resource/images/product/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            try {
                File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
                convertFile.createNewFile();
                FileOutputStream fout = new FileOutputStream(convertFile);
                fout.write(Icon.getBytes());
                fout.close();
                productEntity.setIcon(Pathdb);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } else if (productEntity.getIcon() == null) {
            productEntity.setIcon("");
        }
        productEntity.setDescription(httpServletRequest.getParameter("newDescription"));
        productEntity.setProductcode(httpServletRequest.getParameter("newProductCode"));
        productEntity.setTilecolor(httpServletRequest.getParameter("newColor"));
        productEntity.setProducttypeIdproducttype(DataTypeValidator.parseInt(httpServletRequest.getParameter("newtypeslist")));
        productEntity.setBarcode(httpServletRequest.getParameter("newBarcode"));
        productEntity.setRentingstatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newstatus")));


        return productService.saveProduct(productEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("editproductImageChoser") MultipartFile Icon, @RequestParam("editId") String id, HttpServletRequest httpServletRequest) throws IOException {
//        ProductEntity productEntity = productService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        ProductEntity productEntity = productService.findById(DataTypeValidator.parseInt(id));
        String Pathdb = "/resource/images/product/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            try {
                System.out.println(getClass().getClassLoader().getResource(Pathdb).getFile());
                File convertFile = new File(getClass().getClassLoader().getResource(Pathdb).getFile());
                convertFile.createNewFile();
                FileOutputStream fout = new FileOutputStream(convertFile);
                fout.write(Icon.getBytes());
                fout.close();
                productEntity.setIcon(Pathdb);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        productEntity.setDescription(httpServletRequest.getParameter("editDescription"));
        productEntity.setProductcode(httpServletRequest.getParameter("editProductCode"));
        productEntity.setTilecolor(httpServletRequest.getParameter("editColor"));
        productEntity.setProducttypeIdproducttype(DataTypeValidator.parseInt(httpServletRequest.getParameter("edittypeslist")));
        productEntity.setBarcode(httpServletRequest.getParameter("editBarcode"));
        productEntity.setRentingstatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editStatusCheck")));

        return productService.updateProduct(productEntity);
    }

    @GetMapping("/find/{id}")
    public ProductEntity getProductById(@PathVariable String id) {
        return productService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return productService.deleteById(DataTypeValidator.parseInt(id));
    }
}