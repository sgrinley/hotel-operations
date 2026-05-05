package com.pluralsight;

public class Reservation {

    //    Add: Constants
    public static final String KING = "king";
    public static final String QUEEN = "queen";
    public static final String DOUBLE = "double";

    //    Add: Variable (Store Data) -> Noun
    private String roomType; //    { King/Double }
    private int numberOfNights;
    private boolean isWeekend;


    //    Add: Constructor Method (Function) -> Verb
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.toLowerCase();
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
        this.roomType = roomType.toLowerCase();
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    //    Derived Getter (Pricing Logic)
    public double getPrice() {
        double basePrice;

        if (roomType.equals(KING)) {
            basePrice = 139.00;

        } else if (roomType.equals(QUEEN)) {
            basePrice = 129.00;   // NEW TYPE

        } else {
            basePrice = 124.00;   // DOUBLE (default)
        }

        if (isWeekend) {
            basePrice *= 1.10;
        }

        return basePrice;
    }

    // Total cost
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
