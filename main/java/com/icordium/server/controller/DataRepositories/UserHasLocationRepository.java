package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.UserHasLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserHasLocationRepository extends JpaRepository<UserHasLocationEntity, Integer> {
    List<UserHasLocationEntity> findByUsersIdusers(int usersIdusers);
}