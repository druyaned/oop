package druyaned.designpatterns.behavioral.state.src.states;

import druyaned.designpatterns.behavioral.state.src.Player;
import java.util.List;

public class PlayingState extends ActiveState {
    
    public PlayingState(Player player) {
        super(player);
    }
    
    @Override public String getId() {
        return "playing";
    }
    
    @Override public void nextSong(List<String> songs) {
        System.out.println("PlayingState.nextSong");
        super.nextSong(songs);
    }
    
    @Override public void previousSong(List<String> songs) {
        System.out.println("PlayingState.previousSong");
        super.previousSong(songs);
    }
    
    @Override public void clickPlay() {
        System.out.println("PlayingState.clickPlay");
        player.setState(new ReadyState(player));
    }
    
    @Override public void clickLock() {
        System.out.println("PlayingState.clickLock");
        super.clickLock();
    }
    
    @Override public void volumeUp() {
        System.out.println("PlayingState.volumeUp");
        super.volumeUp();
    }
    
    @Override public void volumeDown() {
        System.out.println("PlayingState.volumeDown");
        super.volumeDown();
    }
    
}
