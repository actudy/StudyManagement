package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.dao.UserDao;

public class UserDaoFactory {
    private static UserDao daoInstance = null;

    public static synchronized UserDao getInstance() {
        if(daoInstance == null) {
            daoInstance = new UserDao();
            return daoInstance;
        }
        return daoInstance;
    }
}
