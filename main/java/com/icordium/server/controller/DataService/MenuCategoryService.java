package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.MenucategoyEntity;

import java.util.List;

public interface MenuCategoryService {
    List<MenucategoyEntity> findAllMenuCategory();

    List<MenucategoyEntity> findAllActiveMenuCategory(int status);

    String saveMenuCategory(MenucategoyEntity menucategoyEntity);

    String updateMenuCategory(MenucategoyEntity menucategoyEntity);

    MenucategoyEntity findById(int id);

    String deleteById(int id);
}