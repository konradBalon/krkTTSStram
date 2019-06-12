package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Properties {

    public List<Tram> getTramList() throws IOException {


        List<Tram> lista = new ArrayList<>();

        DataReader dataReader = new DataReader();
        String aktualnyString;
        String s = dataReader.readFromURL();
        //     System.out.println("pobrane dane z TTSS: \n"+ s);

        Scanner scanner = new Scanner(s);


        while (scanner.hasNextLine()) {
            double localLatitude;
            double localLongitude;
            String id;
            String name;

            aktualnyString = scanner.nextLine();

            name = (aktualnyString.substring(28, 30));
            localLatitude = Integer.parseInt(aktualnyString.substring(10, 19));
            localLongitude = Integer.parseInt(aktualnyString.substring(aktualnyString.length() - 8, aktualnyString.length()));
            id = (aktualnyString.substring(aktualnyString.length() - 60, aktualnyString.length() - 40));

//            System.out.println(aktualnyString + "\n");
//            System.out.println("id: " +id);
//            System.out.println("name: " + name);
//            System.out.println("latitude, longitude:  " + localLatitude/3600000 +" ,"+ localLongitude/3600000 +"\n");


            Tram tram = new Tram(name, localLatitude, localLongitude, id);
            lista.add(tram);


        }

        for (Tram t : lista) {
            if (t.getName().equals("10")) {

                System.out.println("name, latitude, longitude: " +t.getName()+" "+  t.getLatitude() + "," + t.getLongitude());
            }


        }

return lista;
    }
}

