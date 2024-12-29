package druyaned.solid.openclosed.src;

public class SMSService implements NotificationService {
    
    @Override public void send(String message) {
        System.out.println("SMS notification: " + message);
    }
    
}
