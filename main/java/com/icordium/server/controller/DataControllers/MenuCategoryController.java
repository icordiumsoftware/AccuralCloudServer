package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.MenuCategoryService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.MenucategoyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/menucategory")
public class MenuCategoryController {

    @Autowired
    private MenuCategoryService menuCategoryService;

    @GetMapping("/all")
    public List<MenucategoyEntity> allProducts() {
        return menuCategoryService.findAllMenuCategory();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newproductImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        MenucategoyEntity menucategoyEntity = new MenucategoyEntity();
        String Pathdb = "resource\\images\\menucategory\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menucategory\\");
            if (!convertFile.exists()) {
                convertFile.mkdir();
            }
            convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            menucategoyEntity.setIcon(Pathdb);
        } else if (menucategoyEntity.getIcon() == null) {
            menucategoyEntity.setIcon("");
        }
        menucategoyEntity.setMenucategoy(httpServletRequest.getParameter("newCatogory"));
        menucategoyEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newstatus")));

        return menuCategoryService.saveMenuCategory(menucategoyEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("ediproductImageChoser") MultipartFile Icon, @RequestParam("editId") String id, HttpServletRequest httpServletRequest) throws IOException {
//        ProductEntity productEntity = productService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        MenucategoyEntity menucategoyEntity = menuCategoryService.findById(DataTypeValidator.parseInt(id));
        String Pathdb = "resource\\images\\menucategory\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menucategory\\");
            if (!convertFile.exists()) {
                convertFile.mkdir();
            }
            convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            menucategoyEntity.setIcon(Pathdb);
        }
        menucategoyEntity.setMenucategoy(httpServletRequest.getParameter("editCatogory"));
        menucategoyEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editStatusCheck")));

        return menuCategoryService.updateMenuCategory(menucategoyEntity);
    }

    @GetMapping("/find/{id}")
    public MenucategoyEntity getProductById(@PathVariable String id) {
        return menuCategoryService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return menuCategoryService.deleteById(DataTypeValidator.parseInt(id));
    }
}
