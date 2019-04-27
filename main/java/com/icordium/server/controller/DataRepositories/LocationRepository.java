package com.icordium.server.controller.DataRepositories;

import com.icordium.server.controller.datamodel.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {
    List<LocationEntity> findByStatus(int status);
}