package com.github.druyaned.designpatterns.behavioral.state.src.states;

import com.github.druyaned.designpatterns.behavioral.state.src.Player;
import java.util.List;

public class ReadyState extends ActiveState {
    
    public ReadyState(Player player) {
        super(player);
    }
    
    @Override public String getId() {
        return "ready";
    }
    
    @Override public void nextSong(List<String> songs) {
        System.out.println("ReadyState.nextSong");
        super.nextSong(songs);
    }
    
    @Override public void previousSong(List<String> songs) {
        System.out.println("ReadyState.previousSong");
        super.previousSong(songs);
    }
    
    @Override public void clickPlay() {
        System.out.println("ReadyState.clickPlay");
        player.setState(new PlayingState(player));
    }
    
    @Override public void clickLock() {
        System.out.println("ReadyState.clickLock");
        super.clickLock();
    }
    
    @Override public void volumeUp() {
        System.out.println("ReadyState.volumeUp");
        super.volumeUp();
    }
    
    @Override public void volumeDown() {
        System.out.println("ReadyState.volumeDown");
        super.volumeDown();
    }
    
}
