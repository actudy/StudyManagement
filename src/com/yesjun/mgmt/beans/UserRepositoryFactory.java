package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.repository.MGMT_USER;

public class UserRepositoryFactory {
    private static MGMT_USER dbInstance = null;

    public static synchronized MGMT_USER getInstance() {
        if(dbInstance == null) {
            dbInstance = new MGMT_USER();
            return dbInstance;
        }
        return dbInstance;
    }
}
