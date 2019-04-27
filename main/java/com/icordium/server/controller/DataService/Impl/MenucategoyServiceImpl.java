package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.MenucategoyEntityRepository;
import com.icordium.server.controller.DataService.MenuCategoryService;
import com.icordium.server.controller.datamodel.MenucategoyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenucategoyServiceImpl implements MenuCategoryService {
    @Autowired
    MenucategoyEntityRepository menucategoyEntityRepository;

    @Override
    public List<MenucategoyEntity> findAllMenuCategory() {
        return menucategoyEntityRepository.findAll();
    }

    @Override
    public List<MenucategoyEntity> findAllActiveMenuCategory(int status) {
        return menucategoyEntityRepository.findByStatus(status);
    }

    @Override
    public String saveMenuCategory(MenucategoyEntity menucategoyEntity) {
        menucategoyEntityRepository.save(menucategoyEntity);
        menucategoyEntityRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + menucategoyEntity.getIdmenucategoy() + "\"}";
    }

    @Override
    public String updateMenuCategory(MenucategoyEntity menucategoyEntity) {
        if (menucategoyEntity.getIdmenucategoy() != 0) {
            menucategoyEntityRepository.save(menucategoyEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenucategoyEntity findById(int id) {
        return menucategoyEntityRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        menucategoyEntityRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}