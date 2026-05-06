package com.pluralsight;

public class Hotel {

    //    Add: Variable (Store Data) -> Noun
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //    Add: Constructor Method (Function) -> Verb
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
    //    Add: 2nd Constructor Method (No Booking Yet - Default [0])
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

//    Add: Booking Method
    public boolean bookRoom(int numberOfRoomsRequested, boolean isSuite) {

        if (numberOfRoomsRequested <= 0) {
            System.out.println("Invalid number of rooms requested.");
            return false;
        }

        if (isSuite) {
            int availableSuites = getAvailableSuites();

            if (numberOfRoomsRequested <= availableSuites) {
                bookedSuites += numberOfRoomsRequested;
                return true;
            } else {
                System.out.println("Not enough suites available.");
                return false;
            }

        } else {
            int availableRooms = getAvailableRooms();

            if (numberOfRoomsRequested <= availableRooms) {
                bookedBasicRooms += numberOfRoomsRequested;
                return true;
            } else {
                System.out.println("Not enough basic rooms available.");
                return false;
            }
        }
    }

    // Add: Getters

    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // ===== Optional Getters (Safe to include) =====

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}