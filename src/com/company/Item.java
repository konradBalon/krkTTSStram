package com.company;

public class Item {

    public long id;
    public String name;
    public String category;
    public double latitude;
    public double longitude;
    public double heading;
    public String line_number;
    public String direction;
    public String stock_number;
    public String stock_type;
    public int low_floor;
    public String low_floor_display;
    public String display;

    public Item(long id, String name, String category, double latitude, double longitude, double heading, String line_number, String direction, String stock_number, String stock_type, int low_floor, String low_floor_display, String display) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.latitude = latitude;
        this.longitude = longitude;
        this.heading = heading;
        this.line_number = line_number;
        this.direction = direction;
        this.stock_number = stock_number;
        this.stock_type = stock_type;
        this.low_floor = low_floor;
        this.low_floor_display = low_floor_display;
        this.display = display;
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getHeading() {
        return heading;
    }

    public String getLine_number() {
        return line_number;
    }

    public String getDirection() {
        return direction;
    }

    public String getStock_number() {
        return stock_number;
    }

    public String getStock_type() {
        return stock_type;
    }

    public int getLow_floor() {
        return low_floor;
    }

    public String getLow_floor_display() {
        return low_floor_display;
    }

    public String getDisplay() {
        return display;
    }



}
