package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.ProductHasMeniItemService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "producthasmennuitems")
@RestController
public class ProductHasMenuItemController {
    @Autowired
    private ProductHasMeniItemService productHasMeniItemService;

    @GetMapping("/all")
    public List<ProductHasMenuitemEntity> allProductHasMenuitem() {
        return productHasMeniItemService.findAllProductHasMeniItem();
    }

    @GetMapping("/bymenuid/{id}")
    public List<ProductHasMenuitemEntity> allProductHasMenuitemByMenuID(@PathVariable String id) {
        return productHasMeniItemService.findByMenuIDProductHasMeniItem(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/add")
    public String addProductHasMenuitem(@RequestBody ProductHasMenuitemEntity productHasMenuitemEntity) {
        return productHasMeniItemService.saveProductHasMeniItem(productHasMenuitemEntity);
    }

    @PutMapping("/update")
    public String updateProductHasMenuitem(@RequestBody ProductHasMenuitemEntity productHasMenuitemEntity) {
        return productHasMeniItemService.updateProductHasMeniItem(productHasMenuitemEntity);
    }

    @GetMapping("/find/{id}")
    public ProductHasMenuitemEntity getProductTypeById(@PathVariable String id) {
        return productHasMeniItemService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductTypeyId(@PathVariable String id) {
        return productHasMeniItemService.deleteById(DataTypeValidator.parseInt(id));
    }
}