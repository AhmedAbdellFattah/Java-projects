/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author Legion
 */
public class Duck extends Animal {

    public String beakColor;

    public Duck(int age, String gender, String beakColor) {
        super(age, gender);
        this.beakColor = beakColor;
    }

    public void swim() {
        System.out.println("The duck is swimming.");
    }

    public void quack() {
        System.out.println("The duck is quacking.");
    }
}
