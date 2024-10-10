package com.github.druyaned.designpatterns.structural.flyweight.src;

/**
 * Image of particle is a unique, extrinsic, mutable state of
 * a particle. It has {@link ParticleImage image}, coordinates (y and x),
 * increment (dy and dx; {@code vector + speed} meaning).
 * 
 * @author druyaned
 */
public class ParticleMove {
    
    private final ParticleImage image;
    private int y, x; // coordinates
    private int dy, dx; // increment = vector + speed
    
    public ParticleMove(ParticleImage image, int y, int x, int dy, int dx) {
        this.image = image;
        this.y = y;
        this.x = x;
        this.dy = dy;
        this.dx = dx;
    }
    
    public ParticleImage getImage() {
        return image;
    }
    
    public int getY() {
        return y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getDy() {
        return dy;
    }
    
    public int getDx() {
        return dx;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setDy(int dy) {
        this.dy = dy;
    }
    
    public void setDx(int dx) {
        this.dx = dx;
    }
    
    public void incrementBy(int tickCount) {
        y += dy * tickCount;
        x += dx * tickCount;
    }
    
    public void draw(PixelColor[][] canvas) {
        final int canvasHeight = canvas.length;
        final int canvasWidth = canvas[0].length;
        final int imageHeght = image.getHeight();
        final int imageWidth = image.getWidth();
        if (canvasHeight < imageHeght || canvasWidth < imageWidth) {
            throw new IllegalStateException("the image is bigger than the canvas");
        }
        if (y < 0) {
            y = 0;
        }
        if (y + imageHeght > canvasHeight) {
            y = canvasHeight - imageHeght;
        }
        if (x < 0) {
            x = 0;
        }
        if (x + imageWidth > canvasWidth) {
            x = canvasWidth - imageWidth;
        }
        image.draw(canvas, y, x);
    }
    
    /**
     * Returns size of the instance fields in bytes.
     * @return size of the instance fields in bytes
     */
    public int instanceSize() {
        return 8 + Integer.BYTES * 4;
    }
    
}
