package druyaned.designpatterns.structural.composite.bintree;

public class Node<T> implements Component<T> {
    
    protected final T value;
    protected Component<T> parent;
    protected Component<T> left;
    protected Component<T> right;
    
    public Node(T value) {
        this.value = value;
    }
    
    protected Node<T> setParent(Component<T> parent) {
        this.parent = parent;
        return this;
    }
    
    protected Node<T> setLeft(Component<T> left) {
        this.left = left;
        return this;
    }
    
    protected Node<T> setRight(Component<T> right) {
        this.right = right;
        return this;
    }
    
    @Override public T value() {
        return value;
    }
    
    @Override public boolean hasParent() {
        return parent != null;
    }
    
    @Override public boolean hasChildren() {
        return true;
    }
    
}
