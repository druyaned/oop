package druyaned.designpatterns.behavioral.visitor.src;

public class Village extends Settlement {
    
    public Village(String id) {
        super(id, 12, (int)2e5, (int)3e4);
    }
    
    @Override public void accept(SettlementVisitor visitor) {
        visitor.visit(this);
    }
    
}
