package com.solirius.hosehackathon.controller;
import com.solirius.hosehackathon.domain.Beacon;
import com.solirius.hosehackathon.repository.BeaconRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.web.bind.annotation.RestController
public class BeaconRestController {

    @Autowired
    private BeaconRepository beaconRepository;

    @GetMapping(value = "/beacons")
    public Iterable<Beacon> findAll() {
        return beaconRepository.findAll();
    }

    @PostMapping(value = "/beacons")
    public Beacon create(Beacon beacon) {
        return beaconRepository.save(beacon);
    }

}
