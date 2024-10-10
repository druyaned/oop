package com.github.druyaned.designpatterns.behavioral.state.src;

import java.util.List;

/**
 * The State interface declares the state-specific methods. These methods
 * should make sense for all concrete states because you don’t want some
 * of your states to have useless methods that will never be called.
 * 
 * <P>Concrete States provide their own implementations for the state-specific
 * methods. To avoid duplication of similar code across multiple states,
 * you may provide intermediate abstract classes that encapsulate some common
 * behavior. State objects may store a backreference to the context object.
 * Through this reference, the state can fetch any required info from
 * the context object, as well as initiate state transitions.
 * 
 * <P>Both context and concrete states can set the next state of the context
 * and perform the actual state transition by replacing the state object
 * linked to the context.
 * 
 * @author druyaned
 */
public abstract class State {
    
    protected final Player player;
    
    public State(Player player) {
        this.player = player;
    }
    
    public abstract String getId();
    
    public abstract void nextSong(List<String> songs);
    
    public abstract void previousSong(List<String> songs);
    
    public abstract void clickPlay();
    
    public abstract void clickLock();
    
    public abstract void volumeUp();
    
    public abstract void volumeDown();
    
}
