package druyaned.solid.liskov.src;

public class SalaryAccount implements Account {
    
    private final long id;
    private long balance;
    
    public SalaryAccount(long id) {
        this.id = id;
        balance = 0L;
    }
    
    /**
     * This method is at the correct place.
     * @param sum to make a payment
     * @see AccountBad#payment
     */
    public void payment(long sum) {
        balance -= sum;
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
    
}
