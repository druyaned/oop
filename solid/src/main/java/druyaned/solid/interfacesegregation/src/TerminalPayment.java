package druyaned.solid.interfacesegregation.src;

public class TerminalPayment implements WebPayment, CreditPayment {
    
    @Override public void payWebMoney(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by web money");
    }
    
    @Override public void payCreditMoney(long sum) {
        System.out.println("  Paid " + sum + " \u20bd by credit card");
    }
    
}
