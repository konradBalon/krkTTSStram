package com.company;


import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {


DataReader dt = new DataReader();


String text = dt.getRawDataFromURL();
StringBuilder builder = new StringBuilder();
        Gson g = new Gson();
        Positions  p = g.fromJson(text , Positions.class);
        System.out.println(p.positions.length);
        System.out.println(p.timestamp);

for(int i=1;i<p.positions.length;i++)
{
builder.append(p.positions[i].toString2Excel());
builder.append("\n");
    System.out.println(p.positions[i].toString2Excel() );

 }

        dt.createRawDataFile(Long.toString(p.timestamp) +".TXT" , builder.toString());

    }
}

