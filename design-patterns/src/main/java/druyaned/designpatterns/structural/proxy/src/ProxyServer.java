package druyaned.designpatterns.structural.proxy.src;

import druyaned.designpatterns.structural.proxy.src.lib.Server;
import druyaned.designpatterns.structural.proxy.src.lib.Serverable;
import java.util.Set;

/**
 * The Proxy class has a reference field that points to a
 * {@link Server service object}. After the proxy finishes its processing
 * (e.g., lazy initialization, logging, access control, caching, etc.),
 * it passes the request to the service object.
 * 
 * <P>Usually, proxies manage the full lifecycle of their service objects.
 * 
 * @author druyaned
 */
public class ProxyServer implements Serverable {
    
    private final Serverable server;
    private String cachedId;
    private String cachedData;
    
    public ProxyServer(Serverable server) {
        this.server = server;
    }
    
    @Override public String getData(String id) {
        if (id.equals(cachedId)) {
            return cachedData;
        }
        String data = server.getData(id);
        if (data != null) {
            cachedId = id;
            cachedData = data;
        }
        return data;
    }
    
    @Override public Set<String> getIds() {
        return server.getIds();
    }
    
}
