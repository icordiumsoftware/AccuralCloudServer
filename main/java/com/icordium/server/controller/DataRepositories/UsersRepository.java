package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
    UsersEntity findByUsersnameAndPassword(String username, String password);
}