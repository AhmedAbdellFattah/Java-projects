/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question3;

/**
 *
 * @author Legion
 */
public class Animal {

    public int age;
    public String gender;

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return false;
    }

    public void mate() {
        System.out.println("The animal is mating.");
    }
}
