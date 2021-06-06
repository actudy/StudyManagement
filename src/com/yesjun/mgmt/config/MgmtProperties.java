package com.yesjun.mgmt.config;

public class MgmtProperties {
    final String[] keys = {
            "insert",
            "selectFine",
            "select",
            "terminate"
    };
    final String[] values = {
            "com.yesjun.mgmt.view.InsertView",
            "com.yesjun.mgmt.view.SelectFineView",
            "com.yesjun.mgmt.view.SelectView",
            "com.yesjun.mgmt.view.TerminateView"
    };

    public int size() {
        return keys.length;
    }

    public String[] keys() {
        return keys;
    }

    public String get(String key) {
        return values[getIndexByKey(key)];
    }

    private int getIndexByKey(String key) {
        for(int i = 0; i < keys.length; ++i) {
            if(keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
