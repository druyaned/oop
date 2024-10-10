package com.github.druyaned.designpatterns.behavioral.iterator.src;

public class ListIterator<T> implements Iterator<T> {
    
    private final List<T> list;
    private int index = 0;
    
    public ListIterator(List<T> list) {
        this.list = list;
    }
    
    @Override public boolean hasNext() {
        return index < list.size();
    }
    
    @Override public T next() {
        return list.get(index++);
    }
    
    @Override public void reset() {
        index = 0;
    }
    
}
