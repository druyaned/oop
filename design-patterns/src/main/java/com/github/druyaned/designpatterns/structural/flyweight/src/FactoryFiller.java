package com.github.druyaned.designpatterns.structural.flyweight.src;

import java.util.ArrayList;
import java.util.List;

public class FactoryFiller {
    
    public static void fillImageFactory(ParticleImageFactory imageFactory) {
        String[] imageIds = { "Shrapnel", "Shard", "Pebble" };
        ParticleImage[] images = {
            new ParticleImage(3, 4),
            new ParticleImage(4, 4),
            new ParticleImage(4, 5)
        };
        if (imageIds.length != images.length) {
            throw new IllegalStateException(
                    "imageIds.length=" + imageIds.length +
                    ", images.length=" + images.length
            );
        }
        int counter = 3 - 1;
        for (ParticleImage image : images) {
            switch (counter = (counter + 1) % 3) {
                case 0 -> setAllPixels(image, PixelColor.RED);
                case 1 -> setAllPixels(image, PixelColor.GREEN);
                case 2 -> setAllPixels(image, PixelColor.BLUE);
                default -> setAllPixels(image, PixelColor.OFF);
            }
        }
        for (int i = 0; i < images.length; i++) {
            imageFactory.put(imageIds[i], images[i]);
        }
    }
    
    private static void setAllPixels(ParticleImage image, PixelColor color) {
        final int height = image.getHeight();
        final int width = image.getWidth();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                image.setPixel(y, x, color);
            }
        }
    }
    
    public static void fillMoveFactory(
            ParticleImageFactory imageFactory, ParticleMoveFactory moveFactory
    ) {
        int[]  y = {  4,  5,  5,  8,  9, 10, 12, 12, 13, 14 };
        int[]  x = { 22,  8, 17, 20, 11, 16,  5, 13, 23, 21 };
        int[] dy = { +0, +1, +0, +1, +1, -1, -1, -1, +0, +0 };
        int[] dx = { -1, +1, -1, +0, +1, -1, +1, +1, -1, -1 };
        if (y.length != x.length || y.length != dy.length || y.length != dx.length) {
            throw new IllegalStateException(
                    "y.length=" + y.length +
                    ", x.length=" + x.length +
                    ", dy.length=" + dy.length +
                    ", dx.length=" + dx.length
            );
        }
        final int n = y.length;
        List<String> imageIds = new ArrayList<>(imageFactory.getIds());
        int counter = 0;
        for (int i = 0; i < n; i++) {
            ParticleImage image = imageFactory.getImage(imageIds.get(counter));
            moveFactory.add(new ParticleMove(image, y[i], x[i], dy[i], dx[i]));
            counter = (counter + 1) % imageFactory.size();
        }
    }
    
}
