package druyaned.solid.dependencyinversion.src;

/**
 * Good implementation of the shop with a {@link Payment payment object}.
 * It can be set so it doesn't depends on the concrete instance.
 * 
 * @author druyaned
 */
public class Shop {
    
    private Payment payment;
    
    public Shop(Payment payment) {
        this.payment = payment;
    }
    
    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    public void doPayment(long sum) {
        payment.doTransaction(sum);
    }
    
}
