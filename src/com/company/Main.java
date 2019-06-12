package com.company;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Tram> lista = new ArrayList<>();

        DataReader dataReader = new DataReader();
        String aktualnyString;
        String s = dataReader.readFromURL();
        //     System.out.println("pobrane dane z TTSS: \n"+ s);

        Scanner scanner = new Scanner(s);


        while (scanner.hasNextLine()) {
            double localLatitude;
            double localLongitude;
            String name;

            aktualnyString = scanner.nextLine();
            name = (aktualnyString.substring(28, 30));
            localLatitude = Integer.parseInt(aktualnyString.substring(10, 19));
            localLongitude = Integer.parseInt(aktualnyString.substring(aktualnyString.length() - 8, aktualnyString.length()));
            System.out.println(aktualnyString + "\n");
            System.out.println("name: " + name);
            System.out.println("latitude, longitude:  " + localLatitude/3600000 +" ,"+ localLongitude/3600000 +"\n");


            Tram tram = new Tram(name, localLatitude, localLongitude);
            lista.add(tram);



        }

    }
}

