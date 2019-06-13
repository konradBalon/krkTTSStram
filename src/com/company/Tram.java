package com.company;

public class Tram {
    private String name;

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    private double latitude;
    private double longitude;
    private String id;

    public Tram(String name, double latitude, double longitude, String id) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
    }




}
