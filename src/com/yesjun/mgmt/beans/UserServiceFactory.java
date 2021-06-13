package com.yesjun.mgmt.beans;

import com.yesjun.mgmt.service.UserService;

public class UserServiceFactory {
    private static UserService service = null;

    public static synchronized UserService getInstance() {
        if(service == null) {
            service = new UserService();
            return service;
        }
        return service;
    }
}
