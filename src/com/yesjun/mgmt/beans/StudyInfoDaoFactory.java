package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.dao.StudyInfoDao;

public class StudyInfoDaoFactory {
    private static StudyInfoDao daoInstance = null;

    public static synchronized StudyInfoDao getInstance() {
        if(daoInstance == null) {
            daoInstance = new StudyInfoDao();
            return daoInstance;
        }
        return daoInstance;
    }
}
