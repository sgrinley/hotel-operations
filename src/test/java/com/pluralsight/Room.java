package com.pluralsight;

public class Room {

    //      Step 1: Add Variables
    private int NumberOfBeds;
    private double Price;
    private boolean Occupied;
    private boolean Dirty;



    //      Step 2: Add Constructor Method
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.NumberOfBeds = numberOfBeds;
        this.Price = price;
        this.Occupied = occupied;
        this.Dirty = dirty;

    }

    //      Step 3: Add Getters Method
    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public double getPrice() {
        return Price;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public boolean isDirty() {
        return Dirty;
    }

    public boolean isAvailable() {
        return !Occupied && !Dirty;
    }


    //      Step 3: Add Setters

}
