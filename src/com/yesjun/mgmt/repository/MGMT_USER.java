package com.yesjun.mgmt.repository;

import com.yesjun.mgmt.vo.UserVo;

public class MGMT_USER {
    UserVo[] stores;
    int capacity;
    int usage;

    public MGMT_USER() {
        stores = new UserVo[capacity];
        capacity = 0;
        usage = 0;
    }

    private boolean isFull() {
        return capacity == usage;
    }

    private boolean isEmpty() { return stores.length == 0; }

    private int getIndexByMgmtNum(String MGMT_NUM) {
        for(int i = 0; i < stores.length; ++i) {
            if(MGMT_NUM == stores[i].getMGMT_NUM()) {
                return i;
            }
        }
        return -1;
    }

    public boolean push(UserVo user) {
        if(isFull()) {
            capacity++;
            UserVo[] temp = stores;
            stores = new UserVo[capacity];
            System.arraycopy(temp, 0, stores, 0, usage);
        }
        stores[usage] = user;
        usage++;
        return true;
    }

    public boolean delete(UserVo user) {
        int targetIdx = getIndexByMgmtNum(user.getMGMT_NUM());
        stores[targetIdx].setWTDRW_YN("Y");
        return true;

//        int targetIdx = getIndexByMgmtNum(user.getMGMT_NUM());
//        if(targetIdx != -1) {
//            capacity--;
//            UserVo[] temp = stores;
//            stores = new UserVo[capacity];
//            System.arraycopy(temp, targetIdx, stores, targetIdx, usage - (targetIdx + 1));
//        }
//        usage--;
//        return true;
    }

    public UserVo getUser(String MGMT_NUM) {
        if(isEmpty()) { return null; }

        for(UserVo store : stores) {
            if(store.getMGMT_NUM().equals(MGMT_NUM)) {
                return store;
            }
        }
        return null;
    }
}
