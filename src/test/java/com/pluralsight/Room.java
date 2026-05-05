package com.pluralsight;

public class Room {

    //      Step 1: Add Variables (Noun)
    private int NumberOfBeds;
    private double Price;
    private boolean Occupied;
    private boolean Dirty;


    //      Step 2: Add Constructor Method
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.NumberOfBeds = numberOfBeds;
        this.Price = price;
        this.Occupied = occupied;
        this.Dirty = dirty;

    }

    //      Step 3: Add Getters Method (Verb)
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
        return !Occupied && !Dirty;   // Derived Getter
    }


    //      Step 4: Add Setters Method (Verb)
    public void setNumberOfBeds(int numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        Dirty = dirty;

    }

}
