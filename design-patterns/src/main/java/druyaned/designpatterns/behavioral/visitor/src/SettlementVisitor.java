package druyaned.designpatterns.behavioral.visitor.src;

/**
 * The Visitor interface declares a set of visiting methods that can take
 * concrete elements of an object structure as arguments. These methods may
 * have the same names if the program is written in a language that supports
 * overloading, but the type of their parameters must be different.
 * 
 * <P>Each Concrete Visitor implements several versions of the same behaviors,
 * tailored for different concrete element classes.
 * 
 * @author druyaned
 */
public interface SettlementVisitor {
    
    void visit(Village village);
    
    void visit(Town town);
    
}
