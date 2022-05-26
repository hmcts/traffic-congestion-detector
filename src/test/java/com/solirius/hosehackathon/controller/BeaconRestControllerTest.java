package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.domain.Beacon;
import com.solirius.hosehackathon.repository.BeaconRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@WebMvcTest(BeaconRestController.class)
class BeaconRestControllerTest {

    @Autowired
    @InjectMocks
    private BeaconRestController beaconRestController;
    @MockBean
    private BeaconRepository beaconRepository;

    @Test
    void findAll() {
        Beacon beacon = new Beacon("",51.5072, 0.1276);

        Mockito.when(beaconRepository.findAll()).thenReturn(List.of(beacon));

        List<Beacon> customerList = (List<Beacon>) beaconRestController.findAll();
        assertNotNull(customerList);
        assertEquals(1, customerList.size());
    }

    @Test
    void create() {
        Beacon expectedBeacon = new Beacon("",51.5072, 0.1276);

        Mockito.when(beaconRepository.save(expectedBeacon)).thenReturn(expectedBeacon);


        Beacon actualBeacon = beaconRestController.create(expectedBeacon);
        assertNotNull(actualBeacon);
    }
}