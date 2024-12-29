package druyaned.designpatterns.structural.flyweight.src;

import java.util.ArrayList;
import java.util.List;

/**
 * The game has factories of a particle. It fills the factories and then
 * printing the canvas after some ticks.
 * 
 * @author druyaned
 * @see ParticleImageFactory
 * @see ParticleMoveFactory
 * @see ParticleImage
 * @see ParticleMove
 */
public class Game implements Runnable {
    
    public static final int HEIGHT = 18;
    public static final int WIDTH = 32;
    
    private final ParticleImageFactory imageFactory = new ParticleImageFactory();
    private final ParticleMoveFactory moveFactory = new ParticleMoveFactory();
    private final PixelColor[][] canvas = new PixelColor[HEIGHT][WIDTH];
    
    @Override public void run() {
        FactoryFiller.fillImageFactory(imageFactory);
        FactoryFiller.fillMoveFactory(imageFactory, moveFactory);
        System.out.println("Canvas at the beginning:");
        printCanvas();
        int stepCount = 6;
        int tickCount = 4;
        for (int step = 0; step < stepCount; step++) {
            incrementMovesBy(tickCount);
            System.out.println("Canvas after next " + tickCount + " ticks:");
            printCanvas();
        }
        System.out.println("RAM of Split Particals:     " + totalSplitSize() + " (bytes)");
        System.out.println("RAM of Not Split Particals: " + totalNotSplitSize() + " (bytes)");
    }
    
    /**
     * Returns total size of the particle images and moves in bytes.
     * @return total size of the particle images and moves in bytes
     */
    public int totalSplitSize() {
        int totalSize = 0;
        for (int i = 0; i < moveFactory.size(); i++) {
            totalSize += moveFactory.getMove(i).instanceSize();
        }
        List<String> imageIds = new ArrayList<>(imageFactory.getIds());
        for (String imageId : imageIds) {
            ParticleImage image = imageFactory.getImage(imageId);
            totalSize += image.instanceSize();
        }
        return totalSize;
    }
    
    /**
     * Returns total size of the particles in bytes if they would not have been split.
     * @return total size of the particles in bytes if they would not have been split
     */
    public int totalNotSplitSize() {
        int totalSize = 0;
        for (int i = 0; i < moveFactory.size(); i++) {
            ParticleMove move = moveFactory.getMove(i);
            totalSize += move.instanceSize() - 8 + move.getImage().instanceSize();
        }
        return totalSize;
    }
    
    private void printCanvas() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                canvas[y][x] = PixelColor.OFF;
            }
        }
        for (int i = 0; i < moveFactory.size(); i++) {
            ParticleMove move = moveFactory.getMove(i);
            move.draw(canvas);
        }
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                switch (canvas[y][x]) {
                    case RED -> System.out.print(" R");
                    case GREEN -> System.out.print(" G");
                    case BLUE -> System.out.print(" B");
                    default -> System.out.print(" -");
                }
            }
            System.out.println();
        }
    }
    
    private void incrementMovesBy(int tickCount) {
        for (int i = 0; i < moveFactory.size(); i++) {
            moveFactory.getMove(i).incrementBy(tickCount);
        }
    }
    
}
