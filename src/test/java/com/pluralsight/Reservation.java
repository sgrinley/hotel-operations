package com.pluralsight;

public class Reservation {

    //    Add: Variable (Store Data) -> Noun
    private String roomType; //    { King/Double }
    private int numberOfNights;
    private boolean isWeekend;

    //    Add: Constructor Method (Function) -> Verb
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //    Add: Getters Method (Function) -> Verb
    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }






//    Add: Setters Method (Function) -> Verb
}
