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
public class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department;
    }

    public void displayManagerDetails() {
        displayEmployeeDetails(); 
        System.out.println("Department: " + department);
    }
    
}
