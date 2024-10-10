package com.github.druyaned.designpatterns.structural.proxy.src.lib;

import com.github.druyaned.designpatterns.structural.proxy.Proxy;
import java.util.Map;
import java.util.logging.Logger;

class ServerFiller {
    
    public static void fill(Map<String, String> idToData) {
        Logger.getLogger(Proxy.class.getName()).info("filling the server");
        String[] ids = { "id01", "id02", "id03" };
        String[] datas = { "data01", "data02", "data03" };
        final int n = ids.length;
        for (int i = 0; i < n; i++) {
            idToData.put(ids[i], datas[i]);
        }
    }
    
}
