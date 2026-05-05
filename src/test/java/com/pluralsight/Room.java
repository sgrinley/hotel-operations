package com.pluralsight;

public class Room {

    //      Step 1: Add Variables (Noun)
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    //      Step 2: Add Constructor Method
    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }

    //      Step 3: Add Getters Method (Verb)
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;   // Derived Getter
    }


    //      Step 4: Add Setters Method (Verb)
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;

    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room is not available for check-in! ");
            return;
        }
        occupied = true;
        dirty = true;
    }

    public void checkOut() {
        if (!occupied) {
            System.out.println("Room is vacant! ");
            return;
        }
        occupied = false;
        dirty = true;
    }

    public void cleanRoom() {
        if (!dirty) {
            System.out.println("Room is already clean! ");
            return;
        }
        dirty = false;
    }

}
