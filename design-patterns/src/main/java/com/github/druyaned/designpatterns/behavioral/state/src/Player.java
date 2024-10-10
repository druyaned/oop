package com.github.druyaned.designpatterns.behavioral.state.src;

import com.github.druyaned.designpatterns.behavioral.state.src.states.ReadyState;
import java.util.List;

/**
 * Context stores a reference to one of the concrete state objects
 * and delegates to it all state-specific work. The context communicates
 * with the state object via the state interface. The context exposes
 * a setter for passing it a new state object.
 * 
 * @author druyaned
 */
public class Player {
    
    public static final int MAX_VOLUME = 4;
    public static final int MIN_VOLUME = 0;
    public static final int DEFAULT_VOLUME = (MAX_VOLUME + MIN_VOLUME) / 2;
    
    private State state;
    private int volume;
    private int songId;
    
    public Player() {
        state = new ReadyState(this);
        volume = DEFAULT_VOLUME;
        songId = 0;
    }
    
    public State getState() {
        return state;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public int getSongId() {
        return songId;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void setSongId(int songId) {
        this.songId = songId;
    }
    
    public void nextSong(List<String> songs) {
        state.nextSong(songs);
    }
    
    public void previousSong(List<String> songs) {
        state.previousSong(songs);
    }
    
    public void clickPlay() {
        state.clickPlay();
    }
    
    public void clickLock() {
        state.clickLock();
    }
    
    public void volumeUp() {
        state.volumeUp();
    }
    
    public void volumeDown() {
        state.volumeDown();
    }
    
}
