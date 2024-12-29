package druyaned.designpatterns.creational.factorymethod.src;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Manages the {@link Transport}.
 * @author druyaned
 */
public abstract class Logistics {
    
    protected final Map<String, Transport> idToTransport = new HashMap<>();
    
    public Set<String> getTransportIds() {
        return Collections.unmodifiableSet(idToTransport.keySet());
    }
    
    public abstract String getName();
    
    /**
     * Creates a new transport or returns an existing one.
     * @param id identifier of the transport
     * @return created a new transport or an existing one
     */
    public abstract Transport getTransport(String id);
    
}
