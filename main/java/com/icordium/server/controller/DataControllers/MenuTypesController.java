package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.MenuTypeService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.MenutypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/menutypes")
public class MenuTypesController {
    @Autowired
    private MenuTypeService menuTypeService;

    @GetMapping("/all")
    public List<MenutypeEntity> allProducts() {
        return menuTypeService.findAll();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newTypeImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        MenutypeEntity menutypeEntity = new MenutypeEntity();
        String Pathdb = "resource\\images\\menutype\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menutype\\");
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
        menutypeEntity.setMenutype(httpServletRequest.getParameter("newMenuType"));
        menutypeEntity.setMenucategoyIdmenucategoy(DataTypeValidator.parseInt(httpServletRequest.getParameter("typeCategory")));
        menutypeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newstatus")));


        return menuTypeService.saveMenu(menutypeEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("editTypeImageChoser") MultipartFile Icon, @RequestParam("typeId") String id, HttpServletRequest httpServletRequest) throws IOException {
//        ProductEntity productEntity = productService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        MenutypeEntity menutypeEntity = menuTypeService.findById(DataTypeValidator.parseInt(id));
        String Pathdb = "resource\\images\\menutype\\" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            File convertFile = new File(httpServletRequest.getServletContext().getRealPath("/") + "\\resource\\images\\menutype\\");
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
        menutypeEntity.setMenutype(httpServletRequest.getParameter("editTypeN"));
        menutypeEntity.setMenucategoyIdmenucategoy(DataTypeValidator.parseInt(httpServletRequest.getParameter("edittypeCategory")));
        menutypeEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editTypeStatusCheck")));
        return menuTypeService.update(menutypeEntity);
    }

    @GetMapping("/find/{id}")
    public MenutypeEntity getProductById(@PathVariable String id) {
        return menuTypeService.findById(DataTypeValidator.parseInt(id));
    }

    @GetMapping("/getbycategory/{id}")
    public List<MenutypeEntity> getMennuProductByIdCategory(@PathVariable String id) {
        return menuTypeService.findAllActiveMenuTypesByCategory(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return menuTypeService.deleteById(DataTypeValidator.parseInt(id));
    }
}