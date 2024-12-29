package druyaned.designpatterns.behavioral.visitor.src;

public class Town extends Settlement {
    
    public Town(String id) {
        super(id, 18, (int)15e5, (int)5e4);
    }
    
    @Override public void accept(SettlementVisitor visitor) {
        visitor.visit(this);
    }
    
}
