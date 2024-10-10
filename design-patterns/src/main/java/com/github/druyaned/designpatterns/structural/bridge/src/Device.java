package com.github.druyaned.designpatterns.structural.bridge.src;

import com.github.druyaned.designpatterns.structural.bridge.Bridge;

/**
 * An implementation of the {@link Bridge} design pattern has
 * some basic functionality for TV and Radio.
 * 
 * @author druyaned
 * @see RemoteControl
 */
public interface Device {
    
    boolean isTurnedOn();
    
    void turnOn();
    
    void turnOff();
    
    int getMaxVolume();
    
    int getVolume();
    
    void setVolume(int volume);
    
    int getMaxChannel();
    
    int getChannel();
    
    void setChannel(int channel);
    
}
