package com.github.druyaned.designpatterns.structural.decorator.src;

/**
 * Concrete decorator to compress and decompress the data.
 * @author druyaned
 */
public class CompressionDecorator extends DataSourceDecorator {
    
    public CompressionDecorator(DataSource source) {
        super(source);
    }
    
    @Override public void writeData(String data) {
        super.writeData("[COMPRESSED]\n" + data);
    }
    
    @Override public String readData() {
        return "[DECOMPRESSED]\n" + super.readData();
    }
    
}
