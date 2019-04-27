package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.MenutypeRepository;
import com.icordium.server.controller.DataService.MenuTypeService;
import com.icordium.server.controller.datamodel.MenutypeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuTypesServiceImpl implements MenuTypeService {
    @Autowired
    private MenutypeRepository menutypeRepository;

    @Override
    public List<MenutypeEntity> findAll() {
        return menutypeRepository.findAll();
    }

    @Override
    public List<MenutypeEntity> findAllActive(int status) {
        return menutypeRepository.findByStatus(status);
    }

    @Override
    public List<MenutypeEntity> findAllActiveMenuTypesByCategory(int idcategory) {
        return menutypeRepository.findByStatusAndMenucategoyIdmenucategoy(1, idcategory);
    }

    @Override
    public String saveMenu(MenutypeEntity entity) {
        menutypeRepository.save(entity);
        menutypeRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + entity.getIdmenutype() + "\"}";
    }

    @Override
    public String update(MenutypeEntity entity) {
        if (entity.getIdmenutype() != 0) {
            menutypeRepository.save(entity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenutypeEntity findById(int id) {
        return menutypeRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        menutypeRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}