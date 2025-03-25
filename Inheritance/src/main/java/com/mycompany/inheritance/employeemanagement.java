/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inheritance;

/**
 *
 * @author mac
 */
public class employeemanagement {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();
        
        System.out.println("\n----------------------\n");
        Manager mgr = new Manager("Bob", 80000, "IT");
        System.out.println("Manager Details:");
        mgr.displayManagerDetails();
    }
    
    
}
