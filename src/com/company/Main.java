package com.company;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {


        LocationByID location = new LocationByID();


        for (int i = 0; i < 100; i++) {

            location.printCurrentLocation("-1188950297150681465");
            i++;
            TimeUnit.SECONDS.sleep(5);
        }



    }
}

