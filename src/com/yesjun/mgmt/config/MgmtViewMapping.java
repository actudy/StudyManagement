package com.yesjun.mgmt.config;

import com.yesjun.mgmt.util.Dictionary;
import com.yesjun.mgmt.view.IMgmtVw;

public class MgmtViewMapping {
    private Dictionary mapping;

    public MgmtViewMapping() {
        mapping = new Dictionary();

        try {
            MgmtProperties prop = new MgmtProperties();

            String key = "";
            String className = "";
            for (int i = 0; i < prop.size(); ++i) {
                key = prop.keys()[i];
                className = prop.get(key);
                mapping.put(key, (IMgmtVw) Class.forName(className).newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IMgmtVw getMgmtView(String key) {
        return (IMgmtVw) mapping.get(key);
    }
}
