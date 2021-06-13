package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.service.StudyInfoService;

public class StudyInfoServiceFactory {
    private static StudyInfoService service = null;

    public static synchronized StudyInfoService getInstance() {
        if(service == null) {
            service = new StudyInfoService();
            return service;
        }
        return service;
    }
}
