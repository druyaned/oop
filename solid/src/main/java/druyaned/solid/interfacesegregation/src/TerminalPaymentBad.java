package druyaned.solid.interfacesegregation.src;

public class TerminalPaymentBad implements PaymentsBad {
    
    @Override public void payWebMoney(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by web money");
    }
    
    @Override public void payCreditMoney(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by credit card");
    }
    
    /**
     * Very bad decision cause it just throws an exception.
     * @param sum not to pay, just to throw an exception
     */
    @Override public void payCashMoney(long sum) {
        throw new UnsupportedOperationException("cash money can't be used");
    }
    
}
