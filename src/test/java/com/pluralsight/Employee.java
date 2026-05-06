package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    //    Add: Variable (Store Data) -> Noun
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int punchInTime;


    //    Add: Constructor Method (Function) -> Verb
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //    Add: Derived Getters
    //    Regular Hours
    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    //    Overtime Hours
    public double getOverTimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    //    Total Pay
    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOverTimeHours() * payRate * 1.5;

        return regularPay + overTimePay;
    }

    //  -----  OVERLOADED PUNCH-IN METHOD  -----

    //    Punch-In (manual)
    public void punchIn(int time) {
        punchInTime = time;
    }

    //    Punch-In (automatic)
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        punchInTime = now.getHour() * 60 + now.getMinute(); // convert to minutes
        System.out.printf("%s Clocked in at %d:%02d%n", name, now.getHour(), now.getMinute());
    }

    //  -----  OVERLOADED PUNCH-OUT METHOD  -----

    //    Punch-Out (manual)
    public void punchOut(int time) {
        if (time < punchInTime) {
            System.out.println("Error! Invalid punch out time. ");
            return;
        }
        double hoursWorkedToday = (time - punchInTime) / 60.0;
        hoursWorked += hoursWorkedToday;
        punchInTime = 0;
    }

    //    Punch-Out (automatic)
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int currentTime = now.getHour() * 60 + now.getMinute();

        if (currentTime < punchInTime){
            System.out.println("Error! Invalid punch out time. ");
            return;
        }
        double hoursWorkedToday = (currentTime - punchInTime) / 60.0;
        hoursWorked += hoursWorkedToday;
        punchInTime = 0;
        System.out.printf("%s Clocked in at %d:%02d%n", name, now.getHour(), now.getMinute());
    }

}
