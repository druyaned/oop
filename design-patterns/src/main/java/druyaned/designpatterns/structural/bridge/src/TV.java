package druyaned.designpatterns.structural.bridge.src;

public class TV implements Device {
    
    private boolean turnedOn = false;
    private int volume = 0;
    private int channel = 1;
    
    @Override public boolean isTurnedOn() {
        return turnedOn;
    }
    
    @Override public void turnOn() {
        turnedOn = true;
    }
    
    @Override public void turnOff() {
        turnedOn = false;
    }
    
    @Override public int getMaxVolume() {
        return 20;
    }
    
    @Override public int getVolume() {
        return volume;
    }
    
    @Override public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override public int getMaxChannel() {
        return 50;
    }
    
    @Override public int getChannel() {
        return channel;
    }
    
    @Override public void setChannel(int channel) {
        this.channel = channel;
    }
    
    @Override public String toString() {
        return String.format("TV{turnedOn=%b volume=%d channel=%d}",
                turnedOn, volume, channel);
    }
    
}
