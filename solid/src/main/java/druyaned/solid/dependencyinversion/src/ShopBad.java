package druyaned.solid.dependencyinversion.src;

/**
 * A bad implementation of the {@link Shop} with a bad field {@code cash}.
 * It's bad because another payment methods can be added or it can be changed.
 * 
 * @author druyaned
 */
public class ShopBad {
    
    private CashPaymentBad cash = new CashPaymentBad();
    
    /**
     * Bad method body cause it uses the concrete payment implementation
     * instead of an abstraction.
     * 
     * @param sum to do a payment
     */
    public void doPayment(long sum) {
        cash.doTransaction(sum);
    }
    
}
