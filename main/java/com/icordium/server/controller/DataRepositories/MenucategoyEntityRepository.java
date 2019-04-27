package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.MenucategoyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenucategoyEntityRepository extends JpaRepository<MenucategoyEntity, Integer> {
    List<MenucategoyEntity> findByStatus(int status);
}