package com.github.druyaned.solid.interfacesegregation.src;

/**
 * Bad implementation of an all-in-one-interface. It has methods but
 * must be split into 3 parts: WebPayment, CreditPayment, CashPayment.
 * 
 * @author druyaned
 * @see TerminalPaymentBad#payCashMoney
 */
public interface PaymentsBad {
    
    void payWebMoney(long sum);
    
    void payCreditMoney(long sum);
    
    void payCashMoney(long sum);
    
}
