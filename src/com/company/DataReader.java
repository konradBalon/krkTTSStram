


package com.company;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * method getRawDataFromURL() returns String with separated lines
 * method CreateRawDataFile() crreates rawData.txt file
 */
public class DataReader {


    public String getRawDataFromURL() throws IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(new HttpGet("https://krakowpodreka.pl/pl/vehicles/positions/"));
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");



        String rawData;
        StringBuilder builder = new StringBuilder();


        //   File file = new File("rawData.txt");
        //     FileWriter writer = new FileWriter(file, false);

        try (Scanner scanner = new Scanner(responseString)) {
            builder = new StringBuilder();


            while (scanner.hasNext()) {

                Pattern patternGPS = Pattern.compile("(id.*?None None)");
                Matcher matcher = patternGPS.matcher(scanner.nextLine());

                while (matcher.find()) {

                    //     System.out.println("found: " + matcher.group(1));  //wyświetla znalezione matche
                    builder.append(matcher.group(1) + "\n");

                }
            }


        }


       // return builder.toString();
        return  responseString;
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