package com.github.druyaned.designpatterns.structural.flyweight.src;

import java.util.ArrayList;
import java.util.List;

/**
 * This factory of {@link ParticleMove particle moves} to store
 * all instances as a list.
 * 
 * @author druyaned
 */
public class ParticleMoveFactory {
    
    private final List<ParticleMove> moves = new ArrayList<>();
    
    public boolean add(ParticleMove move) {
        return moves.add(move);
    }
    
    public ParticleMove getMove(int i) {
        return moves.get(i);
    }
    
    public int size() {
        return moves.size();
    }
    
}
