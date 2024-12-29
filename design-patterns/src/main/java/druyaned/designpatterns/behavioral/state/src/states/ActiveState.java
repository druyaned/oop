package druyaned.designpatterns.behavioral.state.src.states;

import druyaned.designpatterns.behavioral.state.src.Player;
import druyaned.designpatterns.behavioral.state.src.State;
import static druyaned.designpatterns.behavioral.state.src.Player.DEFAULT_VOLUME;
import static druyaned.designpatterns.behavioral.state.src.Player.MAX_VOLUME;
import static druyaned.designpatterns.behavioral.state.src.Player.MIN_VOLUME;
import java.util.List;

public abstract class ActiveState extends State {
    
    public ActiveState(Player player) {
        super(player);
    }
    
    @Override public void nextSong(List<String> songs) {
        final int songId = player.getSongId();
        final int songCount = songs.size();
        if (songCount == 0 || songId < 0 || songId >= songCount) {
            player.setSongId(0);
        } else if (songId < songCount - 1) {
            player.setSongId(songId + 1);
        }
    }
    
    @Override public void previousSong(List<String> songs) {
        final int songId = player.getSongId();
        final int songCount = songs.size();
        if (songCount == 0 || songId < 0 || songId >= songCount) {
            player.setSongId(0);
        } else if (songId > 0) {
            player.setSongId(songId - 1);
        }
    }
    
    @Override public void clickLock() {
        player.setState(new LockedState(player));
    }
    
    @Override public void volumeUp() {
        final int volume = player.getVolume();
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            player.setVolume(DEFAULT_VOLUME);
        } else if (volume < MAX_VOLUME) {
            player.setVolume(volume + 1);
        }
    }
    
    @Override public void volumeDown() {
        final int volume = player.getVolume();
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            player.setVolume(DEFAULT_VOLUME);
        } else if (volume > MIN_VOLUME) {
            player.setVolume(volume - 1);
        }
    }
    
}
