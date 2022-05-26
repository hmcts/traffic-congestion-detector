package com.solirius.hosehackathon.repository;

import com.solirius.hosehackathon.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
    Vehicle findByNumberPlate(String numberPlate);
}
