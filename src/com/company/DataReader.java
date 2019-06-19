


package com.company;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * method getRawDataFromURL() returns String with separated lines
 * method CreateRawDataFile() crreates rawData.txt file
 */
public class DataReader {


    public String getRawDataFromURL() throws IOException {


        String rawData;
        StringBuilder builder = new StringBuilder();

        URL url = new URL("http://www.ttss.krakow.pl/internetservice/geoserviceDispatcher/services/vehicleinfo/vehicles");
        URLConnection yc = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));


        //   File file = new File("rawData.txt");
        //     FileWriter writer = new FileWriter(file, false);

        try (Scanner scanner = new Scanner(in)) {
            builder = new StringBuilder();


            while (scanner.hasNext()) {

                Pattern patternGPS = Pattern.compile("(latitude.*?longitude..[0-9]*)");
                Matcher matcher = patternGPS.matcher(scanner.nextLine());

                while (matcher.find()) {

                    //     System.out.println("found: " + matcher.group(1));  //wyświetla znalezione matche
                    builder.append(matcher.group(1) + "\n");

                }
            }


        }


        return builder.toString();
    }

    public void createRawDataFile(String filename) {
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file, false);
            writer.write(getRawDataFromURL());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void createRawDataFile() {
        File file = new File("rawData.txt");
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(getRawDataFromURL());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}