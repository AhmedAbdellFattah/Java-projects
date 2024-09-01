/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Legion
 */
class Faculty extends Employee {
    private double officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, double officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
      public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}
