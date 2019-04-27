package com.icordium.server.controller.DataControllers;


import com.icordium.server.controller.DataGenerator;
import com.icordium.server.controller.DataService.CustomerService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.CustomersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<CustomersEntity> allLocations() {
        return customerService.findAllCustomer();
    }

    @PostMapping(value = "/add")
    public String addLocation(@RequestParam("newCustomerImageChoser") MultipartFile Icon, @RequestParam("newIdentyProofImageChoser") MultipartFile Identy, HttpServletRequest httpServletRequest) throws IOException {
        CustomersEntity customersEntity = new CustomersEntity();
        if (!Icon.isEmpty()) {
            String Pathdb = "/resource/images/customer/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            customersEntity.setCustomerimage(Pathdb);
        } else if (customersEntity.getCustomerimage() == null) {
            customersEntity.setCustomerimage("");
        }
        if (!Identy.isEmpty()) {
            String Pathdb = "/resource/images/customer/proof/" + DataGenerator.getTimeMilescound() + Identy.getOriginalFilename();
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Identy.getBytes());
            fout.close();
            customersEntity.setIdentiftyproofimage(Pathdb);
        } else if (customersEntity.getIdentiftyproofimage() == null) {
            customersEntity.setIdentiftyproofimage("");
        }
        customersEntity.setSuffix(httpServletRequest.getParameter("newSuffix"));
        customersEntity.setFirstname(httpServletRequest.getParameter("newFirstName"));
        customersEntity.setLastname(httpServletRequest.getParameter("newLastName"));
        customersEntity.setEmail(httpServletRequest.getParameter("newemail"));
        customersEntity.setGender(DataTypeValidator.parseInt(httpServletRequest.getParameter("newGender")));
        customersEntity.setContactpersonname(httpServletRequest.getParameter("newContactPerson"));
        customersEntity.setMobile(httpServletRequest.getParameter("newMobile"));
        customersEntity.setPhone(httpServletRequest.getParameter("newPhone"));
        customersEntity.setIdnumber(httpServletRequest.getParameter("newIdNumber"));
        //  customersEntity.setDob(simpleDateFormat.(httpServletRequest.getParameter("newDateOfBirth").replace('/','-')));
        customersEntity.setAddress(httpServletRequest.getParameter("newaddress"));
        customersEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newStatus")));
        customersEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("newcreditallow")));
        return customerService.saveCustomer(customersEntity);
    }

    @PostMapping(value = "/update")
    public String updateCustomer(@RequestParam("editCustomerImageChoser") MultipartFile Icon, @RequestParam("editIdentyProofImageChoser") MultipartFile Identy, HttpServletRequest httpServletRequest) throws IOException {
        CustomersEntity customersEntity = customerService.findById(DataTypeValidator.parseInt(httpServletRequest.getParameter("editId")));
        if (!Icon.isEmpty()) {
            String Pathdb = "/resource/images/customer/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Icon.getBytes());
            fout.close();
            customersEntity.setCustomerimage(Pathdb);
        }
        if (!Identy.isEmpty()) {
            String Pathdb = "/resource/images/customer/proof/" + DataGenerator.getTimeMilescound() + Icon.getOriginalFilename();
            File convertFile = new File(httpServletRequest.getServletPath() + Pathdb);
            convertFile.createNewFile();
            FileOutputStream fout = new FileOutputStream(convertFile);
            fout.write(Identy.getBytes());
            fout.close();
            customersEntity.setIdentiftyproofimage(Pathdb);
        }
        customersEntity.setSuffix(httpServletRequest.getParameter("editSuffix"));
        customersEntity.setFirstname(httpServletRequest.getParameter("editFirstName"));
        customersEntity.setLastname(httpServletRequest.getParameter("editLastName"));
        customersEntity.setEmail(httpServletRequest.getParameter("editemail"));
        customersEntity.setGender(DataTypeValidator.parseInt(httpServletRequest.getParameter("editGender")));
        customersEntity.setContactpersonname(httpServletRequest.getParameter("editContactPerson"));
        customersEntity.setMobile(httpServletRequest.getParameter("editMobile"));
        //  customersEntity.setDob(simpleDateFormat.(httpServletRequest.getParameter("newDateOfBirth").replace('/','-')));
        customersEntity.setAddress(httpServletRequest.getParameter("editaddress"));
        customersEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editStatus")));
        customersEntity.setStatus(DataTypeValidator.parseCheckBoxxtoInt(httpServletRequest.getParameter("editCreditAllow")));

        return customerService.updateCustomer(customersEntity);
    }

    @GetMapping("/find/{id}")
    public CustomersEntity getLocationById(@PathVariable String id) {
        return customerService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id) {
        return customerService.deleteById(DataTypeValidator.parseInt(id));
    }
}