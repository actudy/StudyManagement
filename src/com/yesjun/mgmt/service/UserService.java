package com.yesjun.mgmt.service;

import com.yesjun.mgmt.beans.UserDaoFactory;
import com.yesjun.mgmt.dao.UserDao;
import com.yesjun.mgmt.vo.UserVo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = UserDaoFactory.getInstance();
    }

    public UserVo getUser(String MGMT_NUM) { return userDao.getUser(MGMT_NUM); }

    public void insertUser(UserVo user) {
        user.setWTDRW_YN("N");
        userDao.insertUser(user);
    }

    public void deleteUser(UserVo user) {
        user.setWTDRW_YN("Y");
        userDao.deleteUser(user);
    }
}
