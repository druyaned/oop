package com.github.druyaned.designpatterns.behavioral.iterator.src;

public class List<T> implements Collection<T> {
    
    public static final int MAX_CAPACITY = Integer.MAX_VALUE / 2;
    
    private int capacity;
    private int size;
    private Object[] array;
    
    public List() {
        capacity = 16;
        size = 0;
        array = new Object[capacity];
    }
    
    public List(int initCapacity) {
        if (!isCapacityValid(initCapacity)) {
            throw new IllegalArgumentException("invalid initial capacity");
        }
        this.capacity = initCapacity;
        size = 0;
        array = new Object[initCapacity];
    }
    
    public int capacity() {
        return capacity;
    }
    
    @Override public boolean add(T newElement) {
        if (size == capacity) {
            if (!isCapacityValid(capacity * 2)) {
                return false;
            }
            capacity *= 2;
            Object[] oldArray = array;
            array = new Object[capacity];
            System.arraycopy(oldArray, 0, array, 0, size);
        }
        array[size++] = newElement;
        return true;
    }
    
    @Override public T get(int i) {
        return (T)array[i];
    }
    
    @Override public int size() {
        return size;
    }
    
    @Override public Iterator<T> iterator() {
        return new ListIterator<>(this);
    }
    
    private static boolean isCapacityValid(int capacity) {
        return capacity >= 1 && capacity <= MAX_CAPACITY;
    }
    
}
