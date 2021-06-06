package com.yesjun.mgmt.common;

import com.yesjun.mgmt.service.MgmtService;

public class MgmtServiceFactory {
    private static MgmtService service = null;

    public static synchronized MgmtService getInstance() {
        if(service == null) {
            service = new MgmtService();
            return service;
        }
        return service;
    }
}
