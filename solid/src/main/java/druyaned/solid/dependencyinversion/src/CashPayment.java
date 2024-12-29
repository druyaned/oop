package druyaned.solid.dependencyinversion.src;

public class CashPayment implements Payment {
    
    @Override public void doTransaction(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by cash");
    }
    
}
