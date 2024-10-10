package com.github.druyaned.designpatterns.structural.proxy.src.lib;

import java.util.Set;

/**
 * The Service Interface declares the interface of the {@link Server Service}.
 * The proxy must follow this interface to be able to disguise itself
 * as a service object.
 * 
 * @author druyaned
 */
public interface Serverable {
    
    String getData(String id);
    
    Set<String> getIds();
    
}
