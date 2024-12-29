package druyaned.solid.openclosed.src;

/**
 * Provides the {@link #send(java.lang.String)} functionality.
 * So different implementations can behave in different ways
 * and there is no sense to modify the only method again and again.
 * 
 * @author druyaned
 * @see NotificationServiceBad
 */
public interface NotificationService {
    
    /**
     * Sends the message in the command line.
     * @param message   to be sent
     */
    void send(String message);
    
}
