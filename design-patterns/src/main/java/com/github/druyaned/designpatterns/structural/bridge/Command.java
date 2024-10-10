package com.github.druyaned.designpatterns.structural.bridge;

import java.util.function.Consumer;

public class Command<T> {
    
    private final String name;
    private final Consumer<T> action;
    
    public Command(String name, Consumer<T> action) {
        this.name = name;
        this.action = action;
    }
    
    public String getName() {
        return name;
    }
    
    public Consumer<T> getAction() {
        return action;
    }
    
}
