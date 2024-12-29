package druyaned.solid.openclosed;

import druyaned.solid.openclosed.src.SMSService;
import druyaned.solid.openclosed.src.EmailService;
import druyaned.solid.openclosed.src.NotificationService;
import druyaned.solid.openclosed.src.NotificationServiceBad;

/**
 * The second principle of the Object Oriented Programming.
 * 
 * <P>Open Closed Principle (OCP) states:<br>
 * objects or entities should be open for extension
 * but closed for modification.
 * 
 * @author druyaned
 * @see NotificationService
 * @see NotificationServiceBad
 */
public class OpenClosed {
    
    /**
     * To execute the practice implementation of the second OOP principle.
     * @param args no arguments must be given
     */
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SMSService smsService = new SMSService();
        String message = "You have a good code style, keep it up!";
        emailService.send(message);
        smsService.send(message);
    }
    
}
