package druyaned.designpatterns.behavioral.chain.src;

import java.util.ArrayList;
import java.util.List;

/**
 * Box for the {@link Component}.
 * @author druyaned
 */
public class Container extends Component {
    
    private final List<Component> children = new ArrayList<>();
    
    public Container(String name) {
        super(name);
    }
    
    public Container(String name, Container parent) {
        super(name, parent);
    }
    
    public int size() {
        return children.size();
    }
    
    public Component getChild(int i) {
        return children.get(i);
    }
    
    public boolean add(Component child) {
        return children.add(child);
    }
    
}
