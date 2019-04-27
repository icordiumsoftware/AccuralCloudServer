package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.ServiceService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.ServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/servicess")
public class ServicesssController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/all")
    public List<ServiceEntity> allProducts() {
        return serviceService.findAllServices();
    }

    @PostMapping(value = "/add")
    public String addProduct(@RequestParam("newServiceImageChoser") MultipartFile Icon, HttpServletRequest httpServletRequest) throws IOException {
        ServiceEntity serviceEntity = new ServiceEntity();
        String Pathdb = "/resource/images/services/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            try {
                File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
                convertFile.createNewFile();
                FileOutputStream fout = new FileOutputStream(convertFile);
                fout.write(Icon.getBytes());
                fout.close();
                serviceEntity.setIcon(Pathdb);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        } else if (serviceEntity.getIcon() == null) {
            serviceEntity.setIcon("");
        }
        serviceEntity.setServicename(httpServletRequest.getParameter("newDescription"));
        serviceEntity.setCostprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("newCostPrice")));
        serviceEntity.setWholesaleprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("newWholeSalePrice")));
        serviceEntity.setRetailprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("newRetailPrice")));
        serviceEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newstatus")));
        return serviceService.saveService(serviceEntity);
    }

    @PostMapping(value = "/update")
    public String updateProduct(@RequestParam("editServiceImageChoser") MultipartFile Icon, @RequestParam("editId") String id, HttpServletRequest httpServletRequest) throws IOException {
//        ServiceEntity serviceEntity = serviceService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        ServiceEntity serviceEntity = serviceService.findById(DataTypeValidator.parseInt(id));
        String Pathdb = "/resource/images/services/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
        if (!Icon.isEmpty()) {
            try {
                File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
                convertFile.createNewFile();
                FileOutputStream fout = new FileOutputStream(convertFile);
                fout.write(Icon.getBytes());
                fout.close();
                serviceEntity.setIcon(Pathdb);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
        serviceEntity.setServicename(httpServletRequest.getParameter("editDescription"));
        serviceEntity.setCostprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("editCostPrice")));
        serviceEntity.setWholesaleprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("editWholeSalePrice")));
        serviceEntity.setRetailprice(DataTypeValidator.parseDouble(httpServletRequest.getParameter("editRetailPrice")));
        serviceEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editstatus")));
        return serviceService.updateService(serviceEntity);
    }

    @GetMapping("/find/{id}")
    public ServiceEntity getProductById(@PathVariable String id) {
        return serviceService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteProductById(@PathVariable String id) {
        return serviceService.deleteById(DataTypeValidator.parseInt(id));
    }
}