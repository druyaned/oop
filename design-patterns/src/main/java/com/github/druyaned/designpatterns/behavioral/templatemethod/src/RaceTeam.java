package com.github.druyaned.designpatterns.behavioral.templatemethod.src;

/**
 * The Abstract Class declares methods that act as steps of an algorithm,
 * as well as the actual template method which calls these methods in
 * a specific order. The steps may either be declared abstract or have
 * some default implementation.
 * 
 * <P>Concrete Classes can override all of the steps, but not
 * the template method itself.
 * 
 * @author druyaned
 */
public abstract class RaceTeam {
    
    protected final String id;
    
    public RaceTeam(String id) {
        this.id = id;
    }
    
    public final void race() {
        start();
        System.out.println("Reaction time: " + reactionTime());
        pause();
        System.out.println("Pitstop time: " + pitstopTime());
        pause();
        end();
    }
    
    protected void start() {
        System.out.println("Team \"" + id + "\" starts the race");
    }
    
    protected abstract double reactionTime();
    
    protected abstract double pitstopTime();
    
    protected void end() {
        System.out.println("Team \"" + id + "\" finishes the race");
    }
    
    private void pause() {
        final long waiting = 150;
        long time = System.currentTimeMillis() + waiting;
        while (System.currentTimeMillis() != time) {}
    }
    
}
