package druyaned.designpatterns.behavioral.state;

import druyaned.designpatterns.behavioral.state.src.Player;
import java.util.ArrayList;
import java.util.List;

/**
 * Lets an object alter its behavior when its internal state changes.
 * It appears as if the object changed its class.
 * 
 * <P>This structure may look similar to the Strategy pattern, but
 * there’s one key difference. In the State pattern, the particular
 * states may be aware of each other and initiate transitions from
 * one state to another, whereas strategies almost never know about
 * each other.
 * 
 * <P><i>Applicability</i><ul>
 *  <li>Use the State pattern when you have an object that behaves
 *      differently depending on its current state, the number of
 *      states is enormous, and the state-specific code changes
 *      frequently.</li>
 *  <li>Use the pattern when you have a class polluted with massive
 *      conditionals that alter how the class behaves according to
 *      the current values of the class’s fields.</li>
 *  <li>Use State when you have a lot of duplicate code across
 *      similar states and transitions of a condition-based
 *      state machine.</li>
 * </ul>
 * 
 * @author druyaned
 */
public class State {
    
    public static void main(String[] args) {
        Player player = new Player();
        List<String> songs = new ArrayList<>();
        songs.add("Smoke on the Water");
        songs.add("Billie Jean");
        songs.add("Smooth Operator");
        printSongs(songs);
        printPlayer(player, songs);
        player.clickPlay();
        printPlayer(player, songs);
        player.nextSong(songs);
        player.nextSong(songs);
        player.nextSong(songs);
        player.nextSong(songs);
        printPlayer(player, songs);
        player.previousSong(songs);
        player.previousSong(songs);
        player.previousSong(songs);
        player.previousSong(songs);
        printPlayer(player, songs);
        player.clickPlay();
        printPlayer(player, songs);
        player.volumeDown();
        player.volumeDown();
        printPlayer(player, songs);
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        player.volumeUp();
        printPlayer(player, songs);
        player.clickLock();
        printPlayer(player, songs);
        player.clickPlay();
        player.nextSong(songs);
        player.nextSong(songs);
        player.previousSong(songs);
        player.volumeDown();
        printPlayer(player, songs);
        player.clickLock();
        player.nextSong(songs);
        player.volumeDown();
        printPlayer(player, songs);
    }
    
    private static void printSongs(List<String> songs) {
        System.out.println("----<SONGS_BEGIN>----");
        for (String song : songs) {
            System.out.println(song);
        }
        System.out.println("----<SONGS_END>----");
    }
    
    private static void printPlayer(Player player, List<String> songs) {
        System.out.println("----<PLAYER_BEGIN>----");
        System.out.println("State:  " + player.getState().getId());
        System.out.println("Volume: " + player.getVolume());
        System.out.println("Song: " + songs.get(player.getSongId()));
        System.out.println("----<PLAYER_END>----");
    }
    
}
