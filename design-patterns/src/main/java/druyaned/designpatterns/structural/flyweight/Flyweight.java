package druyaned.designpatterns.structural.flyweight;

import druyaned.designpatterns.structural.flyweight.src.Game;
import druyaned.designpatterns.structural.flyweight.src.ParticleImage;
import druyaned.designpatterns.structural.flyweight.src.ParticleMove;

/**
 * Lets you fit more objects into the available amount of RAM by
 * sharing common parts of state between multiple objects
 * instead of keeping all of the data in each object.
 * 
 * <P><i>Usage</i><br>
 * Particle is divided into {@link ParticleImage image} (repeating,
 * intrinsic, immutable state) and {@link ParticleMove move}
 * (unique, extrinsic, mutable state). If it would be monolithic
 * the huge image field would be copied and RAM would be polluted.
 * 
 * <P><i>Applicability</i><br>
 * Use the Flyweight pattern only when your program must support
 * a huge number of objects which barely fit into available RAM.
 * 
 * @author druyaned
 */
public class Flyweight {
    
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
    
}
