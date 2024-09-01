/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Legion
 */

    
    public class JavaApplication1{
     public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = Input.nextLine();

        System.out.print("Age: ");
        int age = Input.nextInt();

        System.out.print("Role: ");
        String role = Input.nextLine();

        System.out.print("Salary: ");
        float salary = Input.nextFloat();

        Employee employee = new Employee();
        
        employee.setName(name);
        employee.setAge(age);
        employee.setRole(role);
        employee.setSalary(salary);

       employee.printEmployee(); 
    }
    }


