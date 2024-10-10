package com.github.druyaned.designpatterns.behavioral.visitor.src;

/**
 * The Element interface declares a method for “accepting” visitors.
 * This method should have one parameter declared with the type of
 * the visitor interface.
 * 
 * <P>Each Concrete Element must implement the acceptance method.
 * The purpose of this method is to redirect the call to the proper
 * visitor’s method corresponding to the current element class. Be aware
 * that even if a base element class implements this method, all subclasses
 * must still override this method in their own classes and call
 * the appropriate method on the visitor object.
 * 
 * @author druyaned
 */
public abstract class Settlement {
    
    private final String id;
    private int profitPercentage;
    private int population;
    private int averageSalary;
    
    public Settlement(String id, int profitPercentage, int population, int averageSalary) {
        this.id = id;
        this.profitPercentage = profitPercentage;
        this.population = population;
        this.averageSalary = averageSalary;
    }
    
    public String getId() {
        return id;
    }
    
    public int getProfitPercentage() {
        return profitPercentage;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public int getAverageSalary() {
        return averageSalary;
    }
    
    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
    
    public void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }
    
    public abstract void accept(SettlementVisitor collector);
    
}
