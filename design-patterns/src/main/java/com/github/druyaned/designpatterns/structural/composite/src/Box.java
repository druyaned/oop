package com.github.druyaned.designpatterns.structural.composite.src;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple container (composite) of a complex delivery package provides
 * its {@link Unit units}.
 * 
 * @author druyaned
 */
public class Box implements Unit {
    
    private final String name;
    private final int weight;
    private final List<Unit> units;
    
    public Box(String name, int weight) {
        this.name = name;
        this.weight = weight;
        units = new ArrayList<>();
    }
    
    /**
     * Returns the units of the box (mutable).
     * @return units of the box (mutable)
     */
    public List<Unit> getUnits() {
        return units;
    }
    
    public int getOwnWeight() {
        return weight;
    }
    
    @Override public String getName() {
        return name;
    }
    
    /**
     * Sums the box weight and all weights of the units and returns the result.
     * @return sum of all weights of the units and the box weight
     */
    @Override public int getWeightG() {
        int total = weight;
        for (Unit unit : units) {
            total += unit.getWeightG();
        }
        return total;
    }
    
    @Override public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Box{name=").append(name);
        builder.append(", weight=").append(weight);
        builder.append(", units=[");
        if (!units.isEmpty()) {
            builder.append(units.get(0));
        }
        for (int i = 1; i < units.size(); i++) {
            builder.append(", ").append(units.get(i));
        }
        builder.append("]}");
        return builder.toString();
    }
    
}
