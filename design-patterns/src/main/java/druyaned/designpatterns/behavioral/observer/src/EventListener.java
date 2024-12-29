package druyaned.designpatterns.behavioral.observer.src;

/**
 * The Subscriber interface declares the notification interface. In most cases,
 * it consists of a single update method. The method may have several parameters
 * that let the publisher pass some event details along with the update.
 * 
 * <P>Concrete Subscribers perform some actions in response to notifications
 * issued by the publisher. All of these classes must implement the same interface
 * so the publisher isn’t coupled to concrete classes.
 * 
 * <P>Usually, subscribers need some contextual information to handle the update
 * correctly. For this reason, publishers often pass some context data as arguments
 * of the notification method. The publisher can pass itself as an argument,
 * letting subscriber fetch any required data directly.
 * 
 * @author druyaned
 */
public interface EventListener {
    
    void update(EventManager manager, String event, String file);
    
}
