package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.MenuitemEntity;

import java.util.List;

public interface MenuItemService {
    List<MenuitemEntity> findAllMenuItem();

    List<MenuitemEntity> findAllActiveMenuItem(int status);

    List<MenuitemEntity> findAllActiveMenuItemByTypesID(int status, int idTypes);

    String saveMenuItem(MenuitemEntity menucategoyEntity);

    String updateMenuItem(MenuitemEntity menucategoyEntity);

    MenuitemEntity findById(int id);

    String deleteById(int id);
}