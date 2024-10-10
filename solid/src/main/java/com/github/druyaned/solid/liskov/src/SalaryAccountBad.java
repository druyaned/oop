package com.github.druyaned.solid.liskov.src;

public class SalaryAccountBad implements AccountBad {
    
    private final long id;
    private long balance;
    
    public SalaryAccountBad(long id) {
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
        balance -= sum;
    }
    
}
