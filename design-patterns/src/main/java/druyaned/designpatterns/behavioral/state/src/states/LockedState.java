package druyaned.designpatterns.behavioral.state.src.states;

import druyaned.designpatterns.behavioral.state.src.Player;
import druyaned.designpatterns.behavioral.state.src.State;
import java.util.List;

public class LockedState extends State {
    
    public LockedState(Player player) {
        super(player);
    }
    
    @Override public String getId() {
        return "locked";
    }
    
    @Override public void nextSong(List<String> songs) {
        System.out.println("LockedState.nextSong");
    }
    
    @Override public void previousSong(List<String> songs) {
        System.out.println("LockedState.previousSong");
    }
    
    @Override public void clickPlay() {
        System.out.println("LockedState.clickPlay");
    }
    
    @Override public void clickLock() {
        System.out.println("LockedState.clickLock");
        player.setState(new ReadyState(player));
    }
    
    @Override public void volumeUp() {
        System.out.println("LockedState.volumeUp");
    }
    
    @Override public void volumeDown() {
        System.out.println("LockedState.volumeDown");
    }
    
}
