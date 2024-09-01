/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Legion
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashPayment cashPayment1 = new CashPayment(25000);
        CashPayment cashPayment2 = new CashPayment(70000);

        CreditCardPayment creditCardPayment1 = new CreditCardPayment(100.0, "Ahmed Ibrahim", "12/30", "1234-5678-9012-3456");
        CreditCardPayment creditCardPayment2 = new CreditCardPayment(200.0, "Salem Ali", "10/28", "9876-5432-2109-8765");

        System.out.println("Cash Payments:");
        cashPayment1.paymentDetails();
        cashPayment2.paymentDetails();

        System.out.println("\nCredit Card Payments:");
        creditCardPayment1.paymentDetails();
        creditCardPayment2.paymentDetails();
    }
}