package druyaned.designpatterns.structural.composite.bintree;

public interface Component<T> {
    
    T value();
    
    boolean hasParent();
    
    boolean hasChildren();
    
}
