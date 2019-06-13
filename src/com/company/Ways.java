package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * method getNumberOfWays() return number of ways as a list
 * nethod getWayInfo() print one way info
 * current number of ways: 21
 * ways available for tracking:[22, 44, 77, 11, 78, 24, 14, 9 , 18, 19, 5 , 3 , 2 , 1 , 71, 50, 73, 52, 76, 10, 21]
 * put "8 " if you want follow oneLetter way
 */
public class Ways {
    public List<String> getNumberOfWays() throws IOException {

        List<String> ways = new ArrayList<>();
        Properties properties = new Properties();
        String[] numeryLinii = properties.getWaysNumberAsArray();
        for (String s : numeryLinii) {
            ways.add(s);

        }
        return ways;
    }

    public void getWayInfo(String way) throws IOException {
        Properties properties = new Properties();
        for (Tram t : properties.getWayProperties(way)) {
            System.out.println(t.toString());

        }


    }


}

