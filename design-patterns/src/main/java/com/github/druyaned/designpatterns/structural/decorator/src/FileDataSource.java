package com.github.druyaned.designpatterns.structural.decorator.src;

/**
 * Concrete Component is a class of objects being wrapped.
 * It defines the basic behavior, which can be altered by decorators.
 * 
 * @author druyaned
 */
public class FileDataSource implements DataSource {
    
    private final String fileName;
    private String data;
    
    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    @Override public void writeData(String data) {
        this.data = data;
    }
    
    @Override public String readData() {
        return data;
    }
    
    
}
