package com.company;

public class Tram {
    private String name;
    private double latitude;
    private double longitude;
    private String id;

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getId() {
        return id;
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


    public Tram(String name, double latitude, double longitude, String id) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
    }

    static class TramBuilder {
        private String name;
        private double latitude;
        private double longitude;
        private String id;



        private TramBuilder() {
        }

        public TramBuilder name(String name) {
            this.name=name;

            return this;
        }

        public TramBuilder id(String id) {
            this.id=id;
            return this;
        }

        public TramBuilder latitude(double latitude) {
            this.latitude=latitude;
            return this;
        }

        public TramBuilder longitude(double longitude) {
            this.longitude=longitude;
            return this;
        }

        public static TramBuilder builder() {
            return new TramBuilder();
        }

        public Tram build() {
            return new Tram(name,latitude,longitude,id);
        }

    }
}