package com.github.druyaned.solid.dependencyinversion.src;

public class CashPaymentBad {
    
    public void doTransaction(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by cash");
    }
    
}
