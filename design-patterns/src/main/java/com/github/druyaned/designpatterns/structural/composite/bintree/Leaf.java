package com.github.druyaned.designpatterns.structural.composite.bintree;

public class Leaf<T> implements Component<T> {
    
    protected final T value;
    protected Component<T> parent;
    
    public Leaf(T value) {
        this.value = value;
    }
    
    protected Leaf<T> setParent(Component<T> parent) {
        this.parent = parent;
        return this;
    }
    
    @Override public T value() {
        return value;
    }
    
    @Override public boolean hasParent() {
        return parent != null;
    }
    
    @Override public boolean hasChildren() {
        return false;
    }
    
}
