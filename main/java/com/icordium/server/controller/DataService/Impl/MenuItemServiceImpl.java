package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.MenuItemRepository;
import com.icordium.server.controller.DataService.MenuItemService;
import com.icordium.server.controller.datamodel.MenuitemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    @Autowired
    MenuItemRepository menuItemRepository;

    @Override
    public List<MenuitemEntity> findAllMenuItem() {
        return menuItemRepository.findAll();
    }

    @Override
    public List<MenuitemEntity> findAllActiveMenuItem(int status) {
        return menuItemRepository.findByStatus(status);
    }

    @Override
    public List<MenuitemEntity> findAllActiveMenuItemByTypesID(int status, int idTypes) {
        return menuItemRepository.findByStatusAndMenutypeIdmenutype(status, idTypes);
    }

    @Override
    public String saveMenuItem(MenuitemEntity menucategoyEntity) {
        menuItemRepository.save(menucategoyEntity);
        menuItemRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + menucategoyEntity.getIdmenuitem() + "\"}";
    }

    @Override
    public String updateMenuItem(MenuitemEntity menucategoyEntity) {
        if (menucategoyEntity.getIdmenuitem() != 0) {
            menuItemRepository.save(menucategoyEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public MenuitemEntity findById(int id) {
        return menuItemRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        menuItemRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}