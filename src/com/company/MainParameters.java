package com.company;

import java.io.IOException;
import java.util.*;

/**
 * method getAllTramProperties() return ~180 Tram objects with current lat,long, name and ID as a list
 * method getWayProperties() return all Tram objects on one way as a list  (e.g "52" will return Trams with name="52" only)
 */
public class MainParameters {

    public MainParameters() {
    }


    DataReader dataReader = new DataReader();
    String data;

    {
        try {
            data = dataReader.getRawDataFromURL();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String[] getWaysNumberAsArray() {
        Set<String> set = new HashSet<>();


        for (Tram t : getAllTramProperties()) {
            set.add(t.getName());
        }



        String[] ways = set.toArray(new String[0]);
        return ways;
    }


    public List<Tram> getWayProperties(String way) {

        List<Tram> wayList = new ArrayList<>();

        for (Tram t : getAllTramProperties()) {

            if (t.getName().equals(way)) {
                wayList.add(t);

            }
        }

        return wayList;

    }

    public List<Tram> getAllTramProperties() {


        List<Tram> trams = new ArrayList<>();

        String aktualnyString;

        //     System.out.println("pobrane dane z TTSS: \n"+ s);

        Scanner scanner = new Scanner(data);


        while (scanner.hasNextLine()) {
             double localLatitude;
            double localLongitude;
            String id;
            String name;

            aktualnyString = scanner.nextLine();

            name = (aktualnyString.substring(28, 30));                                        //przypisuje name=nr linii
            localLatitude = Double.parseDouble(aktualnyString.substring(10, 19));
            localLongitude = Double.parseDouble(aktualnyString.substring(aktualnyString.length() - 8, aktualnyString.length()));
            id = (aktualnyString.substring(aktualnyString.length() - 60, aktualnyString.length() - 40));

            trams.add( new Tram(name, localLatitude/3600000, localLongitude/3600000, id));


        }
        Set<String> numeryLinii = new HashSet<>();
        for (Tram t : trams) {

            numeryLinii.add(t.getName());
            //       System.out.println("name, latitude, longitude: " + t.getName() + " " + t.getLatitude() + "," + t.getLongitude());


        }


        return trams;
    }
}

