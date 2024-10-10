package com.github.druyaned.designpatterns.creational.factorymethod.src;

public class SeaLogistics extends Logistics {
    
    @Override public String getName() {
        return "SeaLogistics";
    }
    
    @Override public Transport getTransport(String id) {
        Transport transport = idToTransport.get(id);
        if (transport == null) {
            transport = new Ship(id);
            idToTransport.put(id, transport);
        }
        return transport;
    }
    
}
