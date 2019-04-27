package com.icordium.server.controller.DataService;

import com.icordium.server.controller.datamodel.UsersEntity;

import java.util.List;

public interface UserService {
    List<UsersEntity> findAllUsers();

    String saveUser(UsersEntity usersEntity);

    String updateUser(UsersEntity usersEntity);

    UsersEntity findById(int id);

    String deleteById(int id);

    UsersEntity findByUsersnameAndPassword(String username, String password);
}