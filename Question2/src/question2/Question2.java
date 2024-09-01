/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2;

/**
 *
 * @author Legion
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(32);
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(44, 'C');

        System.out.println("Temperature 1: " + t1);
        System.out.println("Temperature 2: " + t2);
        System.out.println("Temperature 3: " + t3);
        System.out.println("Temperature 4: " + t4);

        System.out.println("Temperature 1 in Fahrenheit: " + t1.getDegreesFahrenheit());
        System.out.println("Temperature 2 in Celsius: " + t2.getDegreesCelsius());

        System.out.println("Temperature 1 equals Temperature 2: " + t1.equals(t2));
        System.out.println("Temperature 2 is greater than Temperature 3: " + t2.isGreaterThan(t3));
        System.out.println("Temperature 4 is less than Temperature 2: " + t4.isLessThan(t2));
    }
}
