package com.github.druyaned.designpatterns.structural.flyweight.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * This factory of {@link ParticleImage particle images} avoids duplicates.
 * @author druyaned
 */
public class ParticleImageFactory {
    
    private final Map<String, ParticleImage> idToImage = new HashMap<>();
    
    public ParticleImage put(String id, ParticleImage image) {
        return idToImage.put(id, image);
    }
    
    public ParticleImage getImage(String id) {
        return idToImage.get(id);
    }
    
    public int size() {
        return idToImage.size();
    }
    
    public Set<String> getIds() {
        return idToImage.keySet();
    }
    
}
