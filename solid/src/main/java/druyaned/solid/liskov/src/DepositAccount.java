package druyaned.solid.liskov.src;

public class DepositAccount implements Account {
    
    private final long id;
    private long balance;
    
    public DepositAccount(long id) {
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
    
}
