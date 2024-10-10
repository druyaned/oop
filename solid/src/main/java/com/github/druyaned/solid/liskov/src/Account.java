package com.github.druyaned.solid.liskov.src;

/**
 * Correct designed class of an bank account
 * without {@link AccountBad#payment payment method}.
 * 
 * @author druyaned
 */
public interface Account {
    
    public long getId();
    
    public long getBalance();
    
    public void refill(long sum);
    
}
