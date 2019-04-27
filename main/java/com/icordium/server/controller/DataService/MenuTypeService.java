package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.MenutypeEntity;

import java.util.List;

public interface MenuTypeService {
    List<MenutypeEntity> findAll();

    List<MenutypeEntity> findAllActive(int status);

    List<MenutypeEntity> findAllActiveMenuTypesByCategory(int idcategory);

    String saveMenu(MenutypeEntity entity);

    String update(MenutypeEntity entity);

    MenutypeEntity findById(int id);

    String deleteById(int id);
}