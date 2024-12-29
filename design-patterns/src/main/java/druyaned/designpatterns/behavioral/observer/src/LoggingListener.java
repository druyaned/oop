package druyaned.designpatterns.behavioral.observer.src;

import druyaned.designpatterns.behavioral.observer.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingListener implements EventListener {
    
    public static final Logger logger = Logger.getLogger(Observer.class.getName());
    
    @Override public void update(EventManager manager, String event, String file) {
        logger.log(
                Level.INFO,
                "EventManagerID={0}, event={1}, file={2}",
                new Object[] { manager.getId(), event, file }
        );
    }
    
}
