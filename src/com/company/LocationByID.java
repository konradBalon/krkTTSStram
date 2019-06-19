package com.company;


import com.sun.tools.javac.Main;

import java.util.List;

public class LocationByID extends MainParameters {

    public String currentLocation(String id, List<Tram> t) throws Exception {

        for (Tram tram : t) {
            if (tram.getId().equals(id)) {
          //      System.out.println("coordinate: " + tram.getLatitude() + "   " + tram.getLongitude());

                return Double.toString(tram.getLongitude() + tram.getLatitude());

            }
        }
       return "helo";
    }

    public void printCurrentLocation(String id, List<Tram> t) {

        for (Tram tram : t) {
            if (tram.getId().equals(id))
                System.out.println("coordinates: " + tram.getLatitude() + "   " + tram.getLongitude());
        }


    }

}
