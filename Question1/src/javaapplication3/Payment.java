/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Legion
 */
class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void paymentDetails() {
        System.out.println("Payment amount: $" + amount);
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment amount: $" + getAmount() + " (Payment is in cash)");
    }
}

class CreditCardPayment extends Payment {
    private String cardHolderName;
    private String expirationDate;
    private String creditCardNumber;

    public CreditCardPayment(double amount, String cardHolderName, String expirationDate, String creditCardNumber) {
        super(amount);
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment amount: $" + getAmount() + " (Credit Card Payment)");
        System.out.println("Cardholder: " + cardHolderName);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Credit Card Number: " + creditCardNumber);
    }
}
