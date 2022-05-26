package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.domain.Vehicle;
import com.solirius.hosehackathon.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class VehicleRestController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping(value = "/vehicles")
    public Iterable<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @PostMapping(value= "/vehicles")
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @GetMapping(value = "/vehicles/{numberPlate}")
    public Vehicle findByNumberPlate(@PathVariable String numberPlate) {
        return vehicleRepository.findByNumberPlate(numberPlate);
    }
}
