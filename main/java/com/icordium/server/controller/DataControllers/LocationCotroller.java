package com.icordium.server.controller.DataControllers;

import com.icordium.server.controller.DataService.LocationService;
import com.icordium.server.controller.DataTypeValidator;
import com.icordium.server.controller.datamodel.LocationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationCotroller {
    @Autowired
    private LocationService locationService;

    @GetMapping("/all")
    public List<LocationEntity> allLocations() {
        return locationService.findAllLocation();
    }

    @PostMapping("/add")
    public String addLocation(@RequestBody LocationEntity locationEntity) {
        return locationService.saveLocation(locationEntity);
    }

    @PutMapping("/update")
    public String updateLocation(@RequestBody LocationEntity locationEntity) {
        return locationService.updateLocation(locationEntity);
    }

    @GetMapping("/find/{id}")
    public LocationEntity getLocationById(@PathVariable String id) {
        return locationService.findById(DataTypeValidator.parseInt(id));
    }

    @PostMapping("/delete/{id}")
    public String deleteLocationbyId(@PathVariable String id) {
        return locationService.deleteById(DataTypeValidator.parseInt(id));
    }

}