package com.github.druyaned.designpatterns.structural.decorator.src;

/**
 * The component declares the common interface for both wrappers
 * ({@link EncryptionDecorator} and {@link CompressionDecorator})
 * and {@link DataSourceDecorator wrapped objects}.
 * 
 * @author druyaned
 */
public interface DataSource {
    
    void writeData(String data);
    
    String readData();
    
}
