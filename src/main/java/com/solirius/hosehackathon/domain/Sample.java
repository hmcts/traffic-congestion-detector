package com.solirius.hosehackathon.domain;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Sample {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private long id;

        @ManyToOne
        @JoinColumn(name = "vehicle_id")
        private Vehicle vehicle;

        @ManyToOne
        @JoinColumn(name = "beacon_id")
        private Beacon beacon;

        private LocalTime sampleLocalTime = LocalTime.now();

        public Sample() {
        }

        public Sample(Vehicle vehicle, Beacon beacon, LocalTime sampleLocalTime) {
                this.vehicle = vehicle;
                this.beacon = beacon;
                this.sampleLocalTime = sampleLocalTime;
        }

        public Vehicle getVehicle() {
                return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
                this.vehicle = vehicle;
        }

        public Beacon getBeacon() {
                return beacon;
        }

        public void setBeacon(Beacon beacon) {
                this.beacon = beacon;
        }

        public LocalTime getSampleLocalTime() {
                return sampleLocalTime;
        }

        public void setSampleLocalTime(LocalTime sampleLocalTime) {
                this.sampleLocalTime = sampleLocalTime;
        }
}
