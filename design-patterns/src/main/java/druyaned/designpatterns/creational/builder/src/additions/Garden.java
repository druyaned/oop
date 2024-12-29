package druyaned.designpatterns.creational.builder.src.additions;

import druyaned.designpatterns.creational.builder.src.Addition;
import druyaned.designpatterns.creational.builder.src.House;

public class Garden implements Addition {
    
    private final House house;
    private final int treeCount;
    
    public Garden(House house, int treeCount) {
        this.house = house;
        this.treeCount = treeCount;
    }
    
    @Override public House house() {
        return house;
    }
    
    public int getTreeCount() {
        return treeCount;
    }
    
    @Override public String toString() {
        return "Garden{treeCount=" + treeCount + "}";
    }
    
}
