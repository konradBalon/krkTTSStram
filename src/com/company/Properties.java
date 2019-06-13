package com.company;

import java.io.IOException;
import java.util.*;

/**
 * method getAllTramProperties() return 180 Tram objects with current lat,long, name and ID as a list
 * method getWayProperties() return all Tram objects on one way as a list  (e.g "52" will return Trams with name="52" only)
 */
public class Properties {

    public Properties() throws IOException {
    }

    List<Tram> properties;
    DataReader dataReader = new DataReader();
    String data = dataReader.readFromURL();



    public String[] getWaysNumberAsArray() throws IOException {
        Set<String> set = new HashSet<>();

        for (Tram t : getAllTramProperties()) {
            set.add(t.getName());
        }
String [] ways = set.toArray(new String[0]);
        return ways;
    }


    public List<Tram> getWayProperties(String way) throws IOException {

        List<Tram> wayList = new ArrayList<>();

        for (Tram t : getAllTramProperties()) {

            if (t.getName().equals(way)) {
                wayList.add(t);

            }
        }

        return wayList;

    }

    public List<Tram> getAllTramProperties() throws IOException {


        List<Tram> lista = new ArrayList<>();

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
            localLatitude = Integer.parseInt(aktualnyString.substring(10, 19));
            localLongitude = Integer.parseInt(aktualnyString.substring(aktualnyString.length() - 8, aktualnyString.length()));
            id = (aktualnyString.substring(aktualnyString.length() - 60, aktualnyString.length() - 40));


            Tram tram = new Tram(name, localLatitude, localLongitude, id);
            lista.add(tram);


        }
        Set<String> numeryLinii = new HashSet<>();
        for (Tram t : lista) {

            numeryLinii.add(t.getName());
            //       System.out.println("name, latitude, longitude: " + t.getName() + " " + t.getLatitude() + "," + t.getLongitude());


        }


        return lista;
    }
}

