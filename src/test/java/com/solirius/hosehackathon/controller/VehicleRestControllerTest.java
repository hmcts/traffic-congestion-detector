package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.domain.Vehicle;
import com.solirius.hosehackathon.repository.VehicleRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(VehicleRestController.class)
class VehicleRestControllerTest {

    @Autowired
    @InjectMocks
    private VehicleRestController vehicleRestController;

    @MockBean
    private VehicleRepository vehicleRepository;

    @Test
    void findAllNoRecords() {
        Mockito.when(vehicleRepository.findAll()).thenReturn(Collections.emptyList());
        List<Vehicle> actualVehicleList = (List<Vehicle>) vehicleRestController.findAll();
        assertNotNull(actualVehicleList);
        assertTrue(actualVehicleList.isEmpty());
    }

    @Test
    void findAllOneRecord() {
        Mockito.when(vehicleRepository.findAll()).thenReturn(List.of(new Vehicle("MM14ABF", "", "")));
        List<Vehicle> actualVehicleList = (List<Vehicle>) vehicleRestController.findAll();
        Assertions.assertEquals(1, actualVehicleList.size());
        assertEquals("MM14ABF", actualVehicleList.get(0).getNumberPlate());
    }

    @Test
    void saveVehicle() {
        Vehicle expectedVehicle = new Vehicle("MM14ABF", "", "");
        Mockito.when(vehicleRepository.save(expectedVehicle)).thenReturn(expectedVehicle);
        Vehicle actualVehicle = vehicleRestController.saveVehicle(expectedVehicle);
        assertEquals(expectedVehicle.getNumberPlate(), actualVehicle.getNumberPlate());
    }

    @Test
    void findByNumberPlate() {
        String testPlate = "MM14ABF";
        Mockito.when(vehicleRepository.findByNumberPlate(testPlate)).thenReturn(new Vehicle(testPlate, "", ""));
        Vehicle actualVehicle = vehicleRestController.findByNumberPlate(testPlate);
        assertEquals(testPlate, actualVehicle.getNumberPlate());
    }
}