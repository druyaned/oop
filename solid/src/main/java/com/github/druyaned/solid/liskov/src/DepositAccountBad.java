package com.github.druyaned.solid.liskov.src;

public class DepositAccountBad implements AccountBad {
    
    private final long id;
    private long balance;
    
    public DepositAccountBad(long id) {
        this.id = id;
        balance = 0L;
    }
    
    @Override public long getId() {
        return id;
    }
    
    @Override public long getBalance() {
        return balance;
    }
    
    @Override public void refill(long sum) {
        balance += sum;
    }
    
    @Override public void payment(long sum) {
        throw new UnsupportedOperationException("deposite account can't use payment method");
    }
    
}
