/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author Legion
 */
public class Zebra extends Animal {

    public boolean isWild;

    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);
        this.isWild = isWild;
    }

    public void run() {
        System.out.println("The zebra is running.");
    }
}
