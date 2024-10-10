package com.github.druyaned.designpatterns.structural.flyweight.src;

/**
 * Image of particle is a repeating, intrinsic, immutable state of
 * a particle. It has height, width and a double array of pixels.
 * 
 * @author druyaned
 * @see ParticleMove
 */
public class ParticleImage {
    
    private final int height, width;
    private final PixelColor[][] pixels;
    
    public ParticleImage(int height, int width) {
        this.height = height;
        this.width = width;
        pixels = new PixelColor[height][width];
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    /**
     * Sets color of the pixel.
     * @param y height position
     * @param x width position
     * @param color to be set
     */
    public void setPixel(int y, int x, PixelColor color) {
        pixels[y][x] = color;
    }
    
    /**
     * Returns pixel color at the specified position.
     * @param y height position
     * @param x width position
     * @return pixel color at the specified position
     */
    public PixelColor pixelAt(int y, int x) {
        return pixels[y][x];
    }
    
    public void draw(PixelColor[][] canvas, int y, int x) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas[y + i][x + j] = pixelAt(i, j);
            }
        }
    }
    
    /**
     * Returns size of the instance fields in bytes.
     * @return size of the instance fields in bytes
     */
    public int instanceSize() {
        return Integer.BYTES * 2 + 8 * height + 8 * width;
    }
    
}
