package com.github.druyaned.designpatterns.structural.bridge.src;

import com.github.druyaned.designpatterns.structural.bridge.Bridge;

/**
 * An abstraction of the {@link Bridge} design pattern for the implementation
 * {@link Device} provides some features for the local usage.
 * 
 * @author druyaned
 */
public class RemoteControl {
    
    protected final Device device;
    
    public RemoteControl(Device device) {
        this.device = device;
    }
    
    public void togglePower() {
        if (device.isTurnedOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
    
    public void volumeUp() {
        int volume = device.getVolume();
        if (device.getVolume() < device.getMaxVolume()) {
            device.setVolume(volume + 1);
        }
    }
    
    public void volumeDown() {
        int volume = device.getVolume();
        if (volume > 0) {
            device.setVolume(volume - 1);
        }
    }
    
    public void channelUp() {
        int channel = device.getChannel();
        if (channel < device.getMaxChannel()) {
            device.setChannel(channel + 1);
        }
    }
    
    public void channelDown() {
        int channel = device.getChannel();
        if (channel > 1) {
            device.setChannel(channel - 1);
        }
    }
    
}
