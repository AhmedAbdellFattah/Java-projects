/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Legion
 */
class Employee extends Person {
    private String office;
    private double salary;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }
        public String toString() {
        return super.toString() + "\nOffice: " + office + "\nSalary: " + salary;
    }
}
