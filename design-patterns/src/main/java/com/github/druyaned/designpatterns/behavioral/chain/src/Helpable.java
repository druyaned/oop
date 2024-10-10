package com.github.druyaned.designpatterns.behavioral.chain.src;

/**
 * The Handler declares the interface, common for all concrete handlers.
 * It usually contains just a single method for handling requests,
 * but sometimes it may also have another method for setting
 * the next handler on the chain.
 * 
 * @author druyaned
 */
public interface Helpable {
    
    void appendHelp(StringBuilder builder);
    
}
