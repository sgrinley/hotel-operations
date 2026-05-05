package com.pluralsight;

public class Employee {

    //    Add: Variable (Store Data) -> Noun
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


    //    Add: Constructor Method (Function) -> Verb
    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //    Add: Derived Getters
    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    //    Overtime Hours
    public double getOverTimeHours() {
        if (hoursWorked >40) {
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

}
