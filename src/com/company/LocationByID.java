package com.company;


import java.util.List;

public class LocationByID extends MainParameters {

    public String currentLocation(String id) {
        MainParameters mainParameters = new MainParameters();
        for (Tram tram : mainParameters.getAllTramProperties()) {
            if (tram.getId().equals(id)) {
                //      System.out.println("coordinate: " + tram.getLatitude() + "   " + tram.getLongitude());

                return Double.toString(tram.getLongitude() + tram.getLatitude());

            }
        }
        return "o";
    }

    public void printCurrentLocation(String id) {
        MainParameters parameters = new MainParameters();
        for (Tram tram : parameters.getAllTramProperties()) {
            if (tram.getId().equals(id))
                System.out.println("coordinates: " + tram.getLatitude() + "   " + tram.getLongitude());
        }


    }

}
