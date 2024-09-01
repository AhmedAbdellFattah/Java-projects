/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author Legion
 */
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.title = title;
    }
   public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
