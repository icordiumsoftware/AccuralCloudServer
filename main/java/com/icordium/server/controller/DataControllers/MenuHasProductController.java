package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.MennuHasProductService;
import com.icordium.server.controller.datamodel.ProductHasMenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ISH on 4/1/2019.
 */
@RestController
@RequestMapping("/menuhasproduct")
public class MenuHasProductController {
    @Autowired
    private MennuHasProductService mennuHasProductService;

    @GetMapping("/all")
    public List<ProductHasMenuitemEntity> findAll() {
        return mennuHasProductService.findAll();
    }

    @GetMapping("/findByproduct/{idproduct}")
    public List<ProductHasMenuitemEntity> findAllByProduct(@PathVariable("idproduct") int idproduct) {
        return mennuHasProductService.findAllByProduct(idproduct);
    }

    @GetMapping("/findByMenu/{idmenu}")
    public List<ProductHasMenuitemEntity> findAllByMenuId(@PathVariable("idmenu") int idmenu) {
        return mennuHasProductService.findAllByMenuId(idmenu);
    }

    @PostMapping("/add")
    public String saveMenu(@RequestBody ProductHasMenuitemEntity entity) {
        return mennuHasProductService.saveMenu(entity);

    }

    @PutMapping("/update")
    public String update(@RequestBody ProductHasMenuitemEntity entity) {

        return mennuHasProductService.saveMenu(entity);

    }

    @GetMapping("/find/{id}")
    public ProductHasMenuitemEntity findById(@PathVariable("id") int id) {
        return mennuHasProductService.findById(id);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") int id) {
        return mennuHasProductService.deleteById(id);

    }
}