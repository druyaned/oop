package com.github.druyaned.solid.liskov;

import com.github.druyaned.solid.liskov.src.Account;
import com.github.druyaned.solid.liskov.src.AccountBad;
import com.github.druyaned.solid.liskov.src.DepositAccount;
import com.github.druyaned.solid.liskov.src.DepositAccountBad;
import com.github.druyaned.solid.liskov.src.SalaryAccount;
import com.github.druyaned.solid.liskov.src.SalaryAccountBad;

/**
 * The third principle of the Object Oriented Programming.
 * 
 * <P>Liskov Substitution Principle (LSP) states:<br>
 * functions that use pointers or references to base classes must be able
 * to use objects of derived classes without knowing it.
 * Example of violation: {@link java.util.Collections#unmodifiableList}.
 * 
 * @author  druyaned
 * @see Account
 * @see AccountBad
 */
public class LiskovSubstitution {
    
    /**
     * To execute the practice implementation of the third OOP principle.
     * @param args no arguments must be given
     */
    public static void main(String[] args) {
        SalaryAccount goodSalaryAccount = new SalaryAccount(0L);
        DepositAccount goodDepositAccount = new DepositAccount(1L);
        SalaryAccountBad badSalaryAccount = new SalaryAccountBad(0L);
        DepositAccountBad badDepositAccount = new DepositAccountBad(1L);
        goodSalaryAccount.refill(50000);
        goodDepositAccount.refill(100000);
        goodSalaryAccount.payment(1000);
        try {
            badSalaryAccount.refill(50000);
            badDepositAccount.refill(100000);
            badSalaryAccount.payment(1000);
            badDepositAccount.payment(1000); // throws an exception
        } catch (UnsupportedOperationException exc) {
            exc.printStackTrace();
        }
        showGoodAccount(goodSalaryAccount);
        showGoodAccount(goodDepositAccount);
        showBadAccount(badSalaryAccount);
        showBadAccount(badDepositAccount);
    }
    
    private static void showGoodAccount(Account account) {
        System.out.println(
                "Account: id=" + account.getId() +
                " balance=" + account.getBalance()
        );
    }
    
    private static void showBadAccount(AccountBad account) {
        System.out.println(
                "Account: id=" + account.getId() +
                " balance=" + account.getBalance()
        );
    }
    
}
