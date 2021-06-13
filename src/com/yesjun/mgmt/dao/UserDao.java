package com.yesjun.mgmt.dao;

import com.yesjun.mgmt.beans.UserRepositoryFactory;
import com.yesjun.mgmt.repository.MGMT_USER;
import com.yesjun.mgmt.vo.UserVo;

public class UserDao {
    MGMT_USER userRepo = null;

    public UserDao() { userRepo = UserRepositoryFactory.getInstance(); }

    public UserVo getUser(String MGMT_NUM) { return userRepo.getUser(MGMT_NUM); }

    public void insertUser(UserVo user) { userRepo.push(user); }

    public void deleteUser(UserVo user) { userRepo.delete(user); }
}
