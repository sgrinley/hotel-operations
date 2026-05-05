package com.pluralsight;

public class Main {
    public static void main(String[] args) {

//        Test Room
        Room room = new Room(2, 150.0, false, false);
        System.out.println("Room Available: " + room.isAvailable());

//        Test Reservation
        Reservation reservation = new Reservation ("King", 3, true);
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

//        Test Employee
        Employee employee = new Employee(1, "Jeff", "Front Desk", 20.0, 45);
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }
}
