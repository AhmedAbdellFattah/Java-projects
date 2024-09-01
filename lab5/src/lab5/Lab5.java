/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lab5;

/**
 *
 * @author Legion
 */
import java.util.ArrayList;
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> p1 = new ArrayList<>();
        p1.add(new Person("Ahmed", "haday' elqubba", "654654", "ahmed@gmail.com"));
        p1.add(new Employee("Salma", "Nasr city", "654168", "Salma@gmail.com", "Office 216B", 6000.0));
        p1.add(new Faculty("Ibrahim Khalaf", "Isamilia", "650650", "Ibrahim@example.com", "Office 216A", 80000.0, 12.0, "TA"));
        p1.add(new Staff("Wael", "15 May", "554321", "Wael@gmail.com", "Office G12", 4500.0, "Assistant"));

        for (Person person : p1) {
            System.out.println(person);
            System.out.println("Class Name: " + person.className());
            
        }
    }
}
