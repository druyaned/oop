package com.github.druyaned.solid.liskov.src;

/**
 * Bad implementation of the {@link Account} with a wrong method {@link #payment}.
 * @author druyaned
 */
public interface AccountBad {
    
    public long getId();
    
    public long getBalance();
    
    public void refill(long sum);
    
    /**
     * <i>Wrong method</i>. Can throw an exception {@link DepositAccountBad}.
     * @param sum to make a payment
     */
    public void payment(long sum);
    
}
