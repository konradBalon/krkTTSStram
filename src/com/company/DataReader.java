


package com.company;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataReader {


    public String readFromURL() throws IOException {


        String dane;
        StringBuilder builder = new StringBuilder();
        int iloscTram = 0;
        URL url = new URL("http://www.ttss.krakow.pl/internetservice/geoserviceDispatcher/services/vehicleinfo/vehicles");
        URLConnection yc = url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));


        File file = new File("Dane.txt");
        FileWriter writer = new FileWriter(file, true);

        try (Scanner scanner = new Scanner(in)) {


            while (scanner.hasNext() && scanner.next() != null) {


                Pattern patternGPS = Pattern.compile("(latitude.*?longitude..[0-9]*)");

                Matcher matcher = patternGPS.matcher(scanner.nextLine());


                while (matcher.find()) {

                   // System.out.println("found: " + matcher.group(1));  //wyświetla znalezione matche
                    builder.append(matcher.group(1) + "\n");
                    writer.write(matcher.group(1) + "\n");

                    //    System.out.println(matcher.group().substring(5)+" "+matcher2.group().substring(5));


                }
                writer.close();

            }
            in.close();

        }
        dane = builder.toString();

return dane;
    }


}