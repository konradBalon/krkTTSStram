package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * method getNumberOfWays() return number of ways as a list
 * nethod getWayInfo() print info about trams on selected way
 * current number of ways: 21
 * ways available for tracking:[22, 44, 77, 11, 78, 24, 14, 9 , 18, 19, 5 , 3 , 2 , 1 , 71, 50, 73, 52, 76, 10, 21]
 * put "8 " if you want follow oneLetter way
 */
public  class ByWays extends MainParameters implements TramInfo{



    public List<Tram> getTramListByWay(String way) {
        MainParameters mainParameters = new MainParameters();
        return mainParameters.getWayProperties(way);
    }



    @Override
    public void getLocation(List<Tram> t) {


    }

    @Override
    public void getDescription(List<Tram> t) {
        for(Tram a:t){
            System.out.println(  a.toString());
        }

    }
}
