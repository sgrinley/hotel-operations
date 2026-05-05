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
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    //    Derived Getter
    public double getPrice() {
        double basePrice;

        if (roomType.equalsIgnoreCase("king")) {
            basePrice = 139.00;
        } else {
            basePrice = 124.00;
        }

        if (isWeekend) {
            basePrice *= 1.10; // add 10%
        }

        return basePrice;
    }

    //    Add: Total Reso Cost
    public double getReservationTotal() {
        return getPrice() * numberOfNights;

    }

}
