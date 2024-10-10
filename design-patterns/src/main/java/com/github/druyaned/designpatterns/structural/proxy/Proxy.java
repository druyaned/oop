package com.github.druyaned.designpatterns.structural.proxy;

import com.github.druyaned.designpatterns.structural.proxy.src.ProxyServer;
import com.github.druyaned.designpatterns.structural.proxy.src.lib.Server;
import com.github.druyaned.designpatterns.structural.proxy.src.lib.Serverable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lets you provide a substitute or placeholder for another object.
 * A proxy controls access to the original object, allowing you to perform
 * something either before or after the request gets through to the original object.
 * 
 * <P><i>Usage</i><br>
 * The Client should work with both services and proxies via the same interface.
 * This way you can pass a {@link ProxyServer proxy} into any code that expects
 * a {@link Server service} object.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Lazy initialization (virtual proxy). This is when you have a heavyweight
 *      service object that wastes system resources by being always up,
 *      even though you only need it from time to time.</li>
 *  <li>Access control (protection proxy). This is when you want only
 *      specific clients to be able to use the service object; for instance,
 *      when your objects are crucial parts of an operating system and
 *      clients are various launched applications (including malicious ones).</li>
 *  <li>Local execution of a remote service (remote proxy).
 *      This is when the service object is located on a remote server.</li>
 *  <li>Logging requests (logging proxy). This is when you want to keep a history
 *      of requests to the service object.</li>
 *  <li>Caching request results (caching proxy). This is when you need to cache
 *      results of client requests and manage the life cycle of this cache,
 *      especially if results are quite large.</li>
 *  <li>Smart reference. This is when you need to be able to dismiss a heavyweight
 *      object once there are no clients that use it.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class Proxy {
    
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Proxy.class.getName());
        Serverable server = new Server();
        server = new ProxyServer(server);
        final int times = 3;
        for (String id : server.getIds()) {
            System.out.println();
            for (int i = 0; i < times; i++) {
                logger.log(Level.INFO, "requesting the data of the ID \"{0}\"...", id);
                String data = server.getData(id);
                System.out.println("data: \"" + data + "\"");
            }
        }
    }
    
}
