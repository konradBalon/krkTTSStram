package com.company;

public class Item {

    public long id;
    public String name;
    public String category;
    public double latitude;
    public double longitude;
    public double heading;

    @Override
     public String toString() {
        return "Item{" + "\n"+
                "id=" + id +"\n"+
                "name=" + name + '\n' +
                "category=" + category + '\n' +
                "latitude=" + latitude +'\n' +
                "longitude=" + longitude +'\n' +
                "heading=" + heading +'\n' +
                "line_number=" + line_number + '\n' +
                "direction=" + direction + '\n' +
                "stock_number=" + stock_number + '\n' +
                "stock_type=" + stock_type + '\n' +
                "low_floor=" + low_floor + "\n"+
                "low_floor_display=" + low_floor_display + '\n' +
                "display=" + display + '\n' +
                '}';
    }

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

    public String toString2Excel() {
        return "Item{" + "\t"+
                "id=" + id + "\t"+
                "name=" + name + "\t"+
                "category=" + category+ "\t"+
                "latitude=" + latitude + "\t"+
                "longitude=" + longitude+ "\t"+
                "heading=" + heading + "\t"+
                "line_number=" + line_number + "\t"+
                "direction=" + direction + "\t"+
                "stock_number=" + stock_number + "\t"+
                "stock_type=" + stock_type + "\t"+
                "low_floor=" + low_floor + "\t"+
                "low_floor_display=" + low_floor_display + "\t"+
                "display=" + display+ "\t"+
                '}';
    }


}
