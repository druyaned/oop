package druyaned.designpatterns.behavioral.observer.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Publisher issues events of interest to other objects. These events
 * occur when the publisher changes its state or executes some behaviors.
 * Publishers contain a subscription infrastructure that lets new subscribers
 * join and current subscribers leave the list.
 * 
 * <P>When a new event happens, the publisher goes over the subscription list
 * and calls the notification method declared in the subscriber interface
 * on each subscriber object.
 * 
 * @author druyaned
 */
public class EventManager {
    
    private final String id;
    private final Map<String, List<EventListener>> listeners = new HashMap<>();
    
    public EventManager(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void subscribe(String event, EventListener listener) {
        List<EventListener> list = listeners.get(event);
        if (list == null) {
            list = new ArrayList<>();
            listeners.put(event, list);
        }
        list.add(listener);
    }
    
    public void unsubscribe(String event, EventListener listener) {
        List<EventListener> list = listeners.get(event);
        if (list != null) {
            list.remove(listener);
        }
    }
    
    public void inform(String event, String file) {
        List<EventListener> list = listeners.get(event);
        for (EventListener listener : list) {
            listener.update(this, event, file);
        }
    }
    
}
