package com.solirius.hosehackathon.controller;

import com.solirius.hosehackathon.domain.Sample;
import com.solirius.hosehackathon.repository.BeaconRepository;
import com.solirius.hosehackathon.repository.SampleRepository;
import com.solirius.hosehackathon.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class SampleRestController {

    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    BeaconRepository beaconRepository;

    @Autowired
    SampleRepository sampleRepository;

    @PostMapping(value= "/sample")
    public ResponseEntity<Sample> create(@RequestParam String numberPlate, @RequestParam Long beaconId, @RequestParam String sampleTime) {

        //Enhance this method to calculate speed and raise an alert if necessary

        return new ResponseEntity<>(
                null,
                HttpStatus.BAD_REQUEST);
    }

}
