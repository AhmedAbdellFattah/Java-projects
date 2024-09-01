/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author Legion
 */
public class calculatorr {
    private int num1;
    private int num2;

    public calculatorr(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Numbers for addition must be positive");
        }
        System.out.println("Addition: " + (num1 + num2));
    }

    public void subtract() {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Numbers for subtraction must be positive");
        }
        System.out.println("Subtraction: " + (num1 - num2));
    }

    public void multiply() {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Numbers for multiplication cannot be zero");
        }
        System.out.println("Multiplication: " + (num1 * num2));
    }

    public void divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Denominator cannot be zero for division");
        }
        System.out.println("Division: " + (num1 / num2));
    }
}
