package com.github.druyaned.designpatterns.structural.decorator.src;

/**
 * The Base Decorator class has a field for referencing a wrapped object.
 * The field’s type should be declared as the component interface so
 * it can contain both concrete components and decorators.
 * The base decorator delegates all operations to the wrapped object.
 * 
 * <P>Concrete decorators must call methods on the wrapped object,
 * but may add something of their own to the result. Decorators
 * can execute the added behavior either before or after the call
 * to a wrapped object.
 * 
 * @author druyaned
 */
public class DataSourceDecorator implements DataSource {
    
    protected final DataSource wrapped; // other decorators will be stored here
    
    public DataSourceDecorator(DataSource source) {
        this.wrapped = source;
    }
    
    @Override public void writeData(String data) {
        wrapped.writeData(data);
    }
    
    @Override public String readData() {
        return wrapped.readData();
    }
    
}
