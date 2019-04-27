package com.icordium.server.controller.DataService.Impl;

import com.icordium.server.controller.DataRepositories.UsersRepository;
import com.icordium.server.controller.DataService.UserService;
import com.icordium.server.controller.datamodel.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<UsersEntity> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public UsersEntity findByUsersnameAndPassword(String username, String password) {
        return usersRepository.findByUsersnameAndPassword(username, password);
    }

    @Override
    public String saveUser(UsersEntity usersEntity) {
        usersRepository.save(usersEntity);
        usersRepository.flush();
        return "{\"status\":\"success\",\"id\":\"" + usersEntity.getIdusers() + "\"}";
    }

    @Override
    public String updateUser(UsersEntity usersEntity) {
        if (usersEntity.getIdusers() != 0) {
            UsersEntity update = usersRepository.save(usersEntity);
            return "{\"status\":\"success\"}";
        } else {
            return "{\"status\":\"error\"}";
        }
    }

    @Override
    public UsersEntity findById(int id) {
        return usersRepository.getOne(id);
    }

    @Override
    public String deleteById(int id) {
        usersRepository.deleteById(id);
        return "{\"status\":\"success\"}";
    }
}