package druyaned.designpatterns.behavioral.observer;

import druyaned.designpatterns.behavioral.observer.src.Editor;
import druyaned.designpatterns.behavioral.observer.src.EmailListener;
import druyaned.designpatterns.behavioral.observer.src.EventManager;
import druyaned.designpatterns.behavioral.observer.src.LoggingListener;
import druyaned.designpatterns.behavioral.observer.src.Save;

/**
 * Lets you define a subscription mechanism to notify multiple objects
 * about any events that happen to the object they’re observing.
 * 
 * <P><i>Usage</i><br>
 * The Client creates publisher and subscriber objects separately
 * and then registers subscribers for publisher updates.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the Observer pattern when changes to the state of one object
 *      may require changing other objects, and the actual set of objects
 *      is unknown beforehand or changes dynamically.</li>
 *  <li>Use the pattern when some objects in your app must observe others,
 *      but only for a limited time or in specific cases.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Observer {
    
    public static void main(String[] args) {
        // initialization
        Editor editor = new Editor(
                "mind-blowing-file.txt",
                """
                The text consists of 3 lines.
                That's the second one, which is a bit longer.
                The 3rd line is the shortest.
                """
        );
        EventManager events = new EventManager("LocalEventManager");
        Save save = new Save(editor, events);
        EmailListener email = new EmailListener();
        LoggingListener logging = new LoggingListener();
        events.subscribe("save", email);
        events.subscribe("save", logging);
        // running
        save.execute();
    }
    
}
