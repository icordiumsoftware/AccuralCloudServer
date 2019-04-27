package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.UsersHasPrivilagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserHasPrivilagesRepository extends JpaRepository<UsersHasPrivilagesEntity, Integer> {
    List<UsersHasPrivilagesEntity> findByUsersIdusers(int usersIdusers);
}