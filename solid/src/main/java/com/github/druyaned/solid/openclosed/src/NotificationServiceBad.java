package com.github.druyaned.solid.openclosed.src;

/**
 * Wrong implementation of the {@link NotificationService}.
 * The problem lies in the method modification instead of object extension.
 * 
 * @author  druyaned
 */
public class NotificationServiceBad {
    
    /**
     * <i>Wrong method</i>. New functionality must not modify the method.
     * @param messageType   email or SMS
     * @param message   to be sent
     */
    public void send(String messageType, String message) {
        if (messageType.equals("email")) {
            System.out.println("Email notification: " + message);
        }
        if (messageType.equals("sms")) { // added functionality, i.e. the wrong way
            System.out.println("SMS notification: " + message);
        }
    }
    
}
