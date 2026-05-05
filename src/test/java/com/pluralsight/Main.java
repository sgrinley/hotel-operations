package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("   WELCOME TO HOTEL OPERATIONS PLATFORM SYSTEM");
        System.out.println("==================================================\n");

        Room room = new Room(2, 150.0, false, false);

//        Test Room
        System.out.println("==== ROOM STATUS ====");
        System.out.println("Room Available: " + room.isAvailable());

//        Test Check-in
        room.checkIn();
        System.out.println("Check-in Successful: " + room.isAvailable());

//        Test Check-out
        room.checkOut();
        System.out.println("Check-out Successful: " + room.isAvailable());

//        Test Clean Room
        room.cleanRoom();
        System.out.println("Cleaning Successful: " + room.isAvailable());

        System.out.println("\n==== RESERVATION ====");
//        Test Reservation
        Reservation reservation = new Reservation (Reservation.KING, 3, true);
        System.out.printf("Reservation Total: $%.2f%n", reservation.getReservationTotal());

        System.out.println("\n==== EMPLOYEE ====");
//        Test Employee
        Employee employee = new Employee(1, "Jeff", "Front Desk", 20.0, 45);
        System.out.printf("Total Pay: $%.2f%n", employee.getTotalPay());

    }
}
