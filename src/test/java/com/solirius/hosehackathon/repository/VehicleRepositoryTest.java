package com.solirius.hosehackathon.repository;

import com.solirius.hosehackathon.domain.Vehicle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class VehicleRepositoryTest {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Test
    void saveVehicle() {
        Vehicle testVehicle = new Vehicle("MM14ABF", "", "");
        vehicleRepository.save(testVehicle);
        Optional<Vehicle> actualVehicle = vehicleRepository.findById(1L);
        assertTrue(actualVehicle.isPresent());
        assertEquals("MM14ABF", actualVehicle.get().getNumberPlate());
    }

    @Test
    void findVehicleByNumberPlateOneRecord() {
        Vehicle testVehicle = new Vehicle("MM14ABF", "", "");
        vehicleRepository.save(testVehicle);
        Vehicle actualVehicle = vehicleRepository.findByNumberPlate("MM14ABF");
        assertNotNull(actualVehicle);
    }

    @Test
    void findVehicleByNumberPlateNoRecord() {
        Vehicle actualVehicle = vehicleRepository.findByNumberPlate("MM14ABF");
        assertNull(actualVehicle);
    }

}