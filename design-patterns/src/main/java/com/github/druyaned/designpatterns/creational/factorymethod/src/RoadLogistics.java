package com.github.druyaned.designpatterns.creational.factorymethod.src;

public class RoadLogistics extends Logistics {
    
    @Override public String getName() {
        return "RoadLogistics";
    }
    
    @Override public Transport getTransport(String id) {
        Transport transport = idToTransport.get(id);
        if (transport == null) {
            transport = new Truck(id);
            idToTransport.put(id, transport);
        }
        return transport;
    }
    
}
