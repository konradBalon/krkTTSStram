package com.company;


import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException  {


DataReader dt = new DataReader();
dt.createRawDataFile();

String text = dt.getRawDataFromURL();


        Gson g = new Gson();
        Positions  p = g.fromJson(text , Positions.class);
        System.out.println(p.positions.length);
        System.out.println(p.timestamp);

for(int i=1;i<p.positions.length;i++)
{

    System.out.println(p.positions[i].getName() );

}



    }
}

