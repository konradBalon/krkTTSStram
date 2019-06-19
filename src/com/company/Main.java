package com.company;


import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {


        LocationByID location = new LocationByID();


//        for (int i = 0; i < 100; i++) {
//            MainParameters params = new MainParameters();
//            location.printCurrentLocation("-1188950297150681465", params.getAllTramProperties());
//            i++;
//            TimeUnit.SECONDS.sleep(5);
//        }


        while (true) {
            String id = "-1188950297150681465";
            String loc = null;
            MainParameters param1 = new MainParameters();
            loc = (location.currentLocation(id, param1.getAllTramProperties()));


        }
    }
}

