package com.company;

public class Positions {


    public  Item []  positions;
    public long timestamp;

    public Item[] getItems() {
        return positions;
    }

    public void setItems(Item[] items) {
        this.positions = items;
    }

    public Positions(Item[] items) {
        this.positions = items;

    }
}






