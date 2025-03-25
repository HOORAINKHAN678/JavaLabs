/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylist;


/**
 *
 * @author mac
 */
public class Employee {
     private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    // Getter for name (to find and remove employees)
    public String getName() {
        return name;
    }
}

