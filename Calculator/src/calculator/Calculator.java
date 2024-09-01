/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Legion
 */
class Calculator {
 public static void main(String[] args) {
        try {
            calculatorr obj1 = new calculatorr(5, 3);
            obj1.add();

            calculatorr obj2 = new calculatorr(8, 2);
            obj2.subtract();

            calculatorr obj3 = new calculatorr(4, 7);
            obj3.multiply();

            calculatorr obj4 = new calculatorr(9, 0);
            obj4.divide();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e.getMessage());
        }
    }
}

