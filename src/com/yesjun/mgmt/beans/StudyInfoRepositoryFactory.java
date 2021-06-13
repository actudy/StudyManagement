package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.repository.MGMT_STUDY_INFO;

public class StudyInfoRepositoryFactory {
    private static MGMT_STUDY_INFO dbInstance = null;

    public static synchronized MGMT_STUDY_INFO getInstance() {
        if(dbInstance == null) {
            dbInstance = new MGMT_STUDY_INFO();
            return dbInstance;
        }
        return dbInstance;
    }
}
