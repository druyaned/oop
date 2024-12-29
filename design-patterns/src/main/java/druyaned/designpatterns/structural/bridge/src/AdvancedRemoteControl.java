package druyaned.designpatterns.structural.bridge.src;

/**
 * Adds a little more features for the {@link RemoteControl abstraction}.
 * @author druyaned
 */
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }
    
    public void mute() {
        device.setVolume(0);
    }
    
}
