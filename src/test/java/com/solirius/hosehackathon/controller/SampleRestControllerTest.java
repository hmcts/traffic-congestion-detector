package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.repository.BeaconRepository;
import com.solirius.hosehackathon.repository.SampleRepository;
import com.solirius.hosehackathon.repository.VehicleRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleRestController.class)
class SampleRestControllerTest {

    @Autowired
    @InjectMocks
    private SampleRestController sampleRestController;

    @MockBean
    private SampleRepository sampleRepository;

    @MockBean
    private VehicleRepository vehicleRepository;

    @MockBean
    private BeaconRepository beaconRepository;

    @Test
    void create() {
        //fail("Enhance so to evaluate speed and alert if necessary");
    }

}