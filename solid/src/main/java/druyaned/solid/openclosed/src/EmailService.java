package druyaned.solid.openclosed.src;

public class EmailService implements NotificationService {
    
    @Override public void send(String message) {
        System.out.println("Email notification: " + message);
    }
    
}
