package com.github.druyaned.designpatterns.behavioral.templatemethod.src;

public class RedBullTeam extends RaceTeam {
    
    public RedBullTeam(String id) {
        super(id);
    }
    
    @Override protected double reactionTime() {
        return 0.16;
    }
    
    @Override protected double pitstopTime() {
        return 1.9;
    }
    
}
