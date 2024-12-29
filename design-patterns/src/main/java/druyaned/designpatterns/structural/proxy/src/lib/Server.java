package druyaned.designpatterns.structural.proxy.src.lib;

import druyaned.designpatterns.structural.proxy.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Service is a class that provides some useful business logic.
 * @author druyaned
 */
public class Server implements Serverable {
    
    private final Map<String, String> idToData = new HashMap<>();
    private final long delay = 512; // in milliseconds
    
    public Server() {
        ServerFiller.fill(idToData);
    }
    
    String put(String id, String data) {
        return idToData.put(id, data);
    }
    
    @Override public String getData(String id) {
        Logger.getLogger(Proxy.class.getName())
                .log(Level.INFO, "downloading the data of the ID \"{0}\"...", id);
        long t1 = System.currentTimeMillis(), t2;
        do {
            t2 = System.currentTimeMillis();
        } while (t2 - t1 < delay);
        return idToData.get(id);
    }
    
    @Override public Set<String> getIds() {
        return Collections.unmodifiableSet(idToData.keySet());
    }
    
}
