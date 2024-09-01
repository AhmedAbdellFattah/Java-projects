/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Legion
 */
public class Employee {
    private String name;
    private int age;
    private String role;
    private float salary;
    
    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    //GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public float getSalary() {
        return salary;
    }
    
    //PrintEmployee method
    public void printEmployee() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
    }
}
