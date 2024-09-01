/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Legion
 */


class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
    }

    public String className() {
        return this.getClass().getSimpleName();
    }
} 