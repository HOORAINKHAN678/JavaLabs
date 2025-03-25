/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylist;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class EmployeeArrayList {
     public static void main(String[] args) {
        // Creating an ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Adding Employee objects to the list
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 55000));

        // Displaying employees before removal
        System.out.println("\nEmployee Details (Before Removal):");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

        // Removing an employee (hardcoded like reference program)
        String nameToRemove = "Bob";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(nameToRemove)) {
                employees.remove(i);
                break;
            }
        }

        // Displaying employees after removal
        System.out.println("\nEmployee Details (After Removal):");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
    
}
