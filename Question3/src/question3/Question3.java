/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question3;

/**
 *
 * @author Legion
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a duck object.
        Duck duck = new Duck(1, "female", "yellow");

        // Call the duck's methods.
        duck.swim();
        duck.quack();

        // Create a fish object.
        Fish fish = new Fish(2, "male", 10, true);

        // Call the fish's methods.
        fish.swim();

        // Create a zebra object.
        Zebra zebra = new Zebra(3, "female", true);

        // Call the zebra's methods.
        zebra.run();
    }
}
