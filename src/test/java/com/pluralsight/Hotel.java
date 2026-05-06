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

    private int getAvailableRooms() {
        return 0;
    }

    private int getAvailableSuites() {
        return 0;
    }
