


package com.company;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * method getRawDataFromURL() returns String in JSON format
 * method CreateRawDataFile() crreates rawData.txt file
 */
public class DataReader {
    public String responseString;

    public String getRawDataFromURL() throws IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpResponse response = httpClient.execute(new HttpGet("https://krakowpodreka.pl/pl/vehicles/positions/"));
        HttpEntity entity = response.getEntity();
        responseString = EntityUtils.toString(entity, "UTF-8");


        return responseString;
    }

    public void createRawDataFile(String filename, String input) {
        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(new File(filename)), StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void createRawDataFile() {


        OutputStreamWriter writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream(new File("rawData.txt")), StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            writer.write(responseString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

