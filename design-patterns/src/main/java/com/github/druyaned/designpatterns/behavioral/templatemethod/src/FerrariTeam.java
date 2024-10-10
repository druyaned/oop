package com.github.druyaned.designpatterns.behavioral.templatemethod.src;

public class FerrariTeam extends RaceTeam {
    
    public FerrariTeam(String id) {
        super(id);
    }
    
    @Override protected double reactionTime() {
        return 0.15;
    }
    
    @Override protected double pitstopTime() {
        return 2.1;
    }
    
}
