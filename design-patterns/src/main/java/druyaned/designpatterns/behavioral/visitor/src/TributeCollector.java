package druyaned.designpatterns.behavioral.visitor.src;

public class TributeCollector implements SettlementVisitor {
    
    private int total;
    
    public void reset() {
        total = 0;
    }
    
    public int getTotal() {
        return total;
    }
    
    @Override public void visit(Village village) {
        total += village.getAverageSalary() *
                village.getPopulation() *
                village.getProfitPercentage() / 100;
        System.out.println("Tribute is collected from the village \"" + village.getId() + "\"");
    }
    
    @Override public void visit(Town town) {
        total += town.getAverageSalary() *
                town.getPopulation() *
                town.getProfitPercentage() / 100;
        System.out.println("Tribute is collected from the town \"" + town.getId() + "\"");
    }
    
}
