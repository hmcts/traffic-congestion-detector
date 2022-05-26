package com.solirius.hosehackathon.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class BeaconRepositoryTest {

    @Autowired
    private BeaconRepository beaconRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private CoordinateRepository coordinateRepository;

    @Test
    void findByNumberPlate() {

//        Vehicle vehicle = new Vehicle("MM14ABF");
//        vehicleRepository.save(vehicle);
//
//        Coordinate coordinate = new Coordinate(51.5072, 0.1276);
//        coordinateRepository.save(coordinate);
//
//        Beacon beacon = new Beacon();
//        beacon.setCoordinate(coordinate);
//
//        beaconRepository.save(beacon);
//
//        List<Beacon> storedBeacon = beaconRepository.findByVehicle(vehicle);
//        assertEquals(1, storedBeacon.size());
    }
}