package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_setTime() {
//        Arrange
        Employee employee = new Employee(1, "Jeff", "Front Desk", 20.0, 0);

//        Act
        employee.punchIn(540); // 9:00 AM
        employee.punchOut(600); // 10:00 AM

//        Assert
        assertEquals(1.0, employee.getRegularHours());
    }

    @Test
    void punchOut_addsHours() {
//        Arrange
        Employee emp = new Employee(1, "Jeff", "Front Desk", 20.0, 0);

//        Act
        emp.punchIn(540);
        emp.punchOut(660); // 2 hours later

//        Assert
        assertEquals(2.0, emp.getRegularHours());
    }

    @Test
    void punchOut_invalidTime_noChange() {
//        Arrange
        Employee emp = new Employee(1, "Jeff", "Front Desk", 20.0, 0);


//        Act
        emp.punchIn(600);
        emp.punchOut(500); // invalid

//        Assert
        assertEquals(0.0, emp.getRegularHours());
    }

    @Test
    void overtime_calculation_correct() {
//        Arrange
        Employee emp = new Employee(1, "Jeff", "Front Desk", 20.0, 45);

//        Act
        double regular = emp.getRegularHours();
        double overtime = emp.getOverTimeHours();

//        Assert
        assertEquals(40, regular);
        assertEquals(5, overtime);
    }

    @Test
    void totalPay_correct() {
//        Arrange
        Employee emp = new Employee(1, "Jeff", "Front Desk", 20.0, 45);

//        Act
        double pay = emp.getTotalPay();

//        Assert
        assertEquals(950.0, pay);
    }
}