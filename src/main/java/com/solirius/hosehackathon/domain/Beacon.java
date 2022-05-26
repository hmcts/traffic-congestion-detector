package com.solirius.hosehackathon.domain;

import javax.persistence.*;

@Entity
public class Beacon {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String location;

    private double latitude;
    private double longitude;

    Beacon() {
    }

    public Beacon(String location, double latitude, double longitude) {
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Beacon{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
