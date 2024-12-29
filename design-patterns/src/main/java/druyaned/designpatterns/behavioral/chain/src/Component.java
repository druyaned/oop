package druyaned.designpatterns.behavioral.chain.src;

/**
 * The Base Handler is an optional class where you can put the boilerplate code
 * that’s common to all handler classes.
 * 
 * <P>Usually, this class defines a field for storing a reference to the next
 * handler. The clients can build a chain by passing a handler to the
 * constructor or setter of the previous handler. The class may also implement
 * the default handling behavior: it can pass execution to the next handler
 * after checking for its existence.
 * 
 * @author druyaned
 */
public class Component implements Helpable {
    
    private final String name;
    private Container parent;
    
    public Component(String name) {
        this.name = name;
        this.parent = null;
    }
    
    public Component(String name, Container parent) {
        this.name = name;
        this.parent = parent;
    }
    
    public String getName() {
        return name;
    }
    
    public Container getParent() {
        return parent;
    }
    
    public void setParent(Container parent) {
        this.parent = parent;
        parent.add(this);
    }
    
    @Override public void appendHelp(StringBuilder builder) {
        builder
                .append("Help info of \"")
                .append(name)
                .append("\"\n");
        if (parent != null) {
            parent.appendHelp(builder);
        }
    }
    
}
