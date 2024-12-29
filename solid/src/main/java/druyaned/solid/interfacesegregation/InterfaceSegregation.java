package druyaned.solid.interfacesegregation;

import druyaned.solid.interfacesegregation.src.TerminalPayment;
import druyaned.solid.interfacesegregation.src.TerminalPaymentBad;

/**
 * The fourth principle of the Object Oriented Programming.
 * 
 * <P>Interface Segregation Principle (ISP) states:<br>
 * no code should be forced to depend on methods it does not use.
 * Example of violation: {@link java.util.Iterator}.
 * 
 * @author  druyaned
 */
public class InterfaceSegregation {
    
    /**
     * To execute the practice implementation of the fourth OOP principle.
     * @param args no arguments must be given
     */
    public static void main(String[] args) {
        System.out.println("Bad terminal paymetns:");
        TerminalPaymentBad badTerminal = new TerminalPaymentBad();
        try {
            badTerminal.payWebMoney(12300);
            badTerminal.payCreditMoney(9700);
            badTerminal.payCashMoney(5100);
        } catch (UnsupportedOperationException exc) {
            exc.printStackTrace();
        }
        TerminalPayment goodTerminal = new TerminalPayment();
        System.out.println("Good terminal paymetns:");
        goodTerminal.payWebMoney(12300);
        goodTerminal.payCreditMoney(9700);
    }
    
}
