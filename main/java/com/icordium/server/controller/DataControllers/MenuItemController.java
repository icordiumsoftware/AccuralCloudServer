package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.MenuItemService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.MenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/menuitems")
public class MenuItemController {
    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/all")
    public List<MenuitemEntity> allProducts() {
        return menuItemService.findAllMenuItem();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newItemImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        MenuitemEntity menutypeEntity = new MenuitemEntity();
        String Pathdb = "resource\\images\\menuitem\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menuitem\\");
            if (!convertFile.exists()) {
                convertFile.mkdir();
            }
            convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            menutypeEntity.setIcon(Pathdb);
        } else if (menutypeEntity.getIcon() == null) {
            menutypeEntity.setIcon("");
        }
        menutypeEntity.setMenuitem(httpServletRequest.getParameter("newItem"));
        menutypeEntity.setCostprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("costPrice")));
        menutypeEntity.setSelligprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("sellPrice")));
        menutypeEntity.setMenutypeIdmenutype(DataTypeValidator.parseInt(httpServletRequest.getParameter("itemType")));
        menutypeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newItemstatus")));


        return menuItemService.saveMenuItem(menutypeEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("editItemImageChoser") MultipartFile Icon, @RequestParam("itemId") String id, HttpServletRequest httpServletRequest) throws IOException {
//        ProductEntity productEntity = productService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        MenuitemEntity menutypeEntity = menuItemService.findById(DataTypeValidator.parseInt(id));
        String Pathdb = "resource\\images\\menuitem\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menuitem\\");
            if (!convertFile.exists()) {
                convertFile.mkdir();
            }
            convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            menutypeEntity.setIcon(Pathdb);
        }
        menutypeEntity.setMenuitem(httpServletRequest.getParameter("editItemN"));
        menutypeEntity.setCostprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("ecostPrice")));
        menutypeEntity.setSelligprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("esellPrice")));
        menutypeEntity.setMenutypeIdmenutype(DataTypeValidator.parseInt(httpServletRequest.getParameter("editItemType")));
        menutypeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editItemStatusCheck")));

        return menuItemService.updateMenuItem(menutypeEntity);
    }

    @GetMapping("/find/{id}")
    public MenuitemEntity getProductById(@PathVariable String id) {
        return menuItemService.findById(DataTypeValidator.parseInt(id));
    }

    @GetMapping("/bytypeid/{id}")
    public List<MenuitemEntity> getMenuProductByCategoryId(@PathVariable String id) {
        return menuItemService.findAllActiveMenuItemByTypesID(1, DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return menuItemService.deleteById(DataTypeValidator.parseInt(id));
    }
}