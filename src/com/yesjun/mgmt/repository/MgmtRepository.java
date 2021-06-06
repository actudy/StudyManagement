package com.yesjun.mgmt.repository;

import com.yesjun.mgmt.vo.MgmtVo;

public class MgmtRepository {
    MgmtVo[] store;
    int capacity;
    int usage;

    public MgmtRepository() {
        store = new MgmtVo[capacity];
        capacity = 0;
        usage = 0;
    }

    private boolean isFull() {
        return capacity == usage;
    }

    private boolean isEmpty() { return store.length == 0; }

    public boolean push(MgmtVo value) {
        if(isFull()) {
            capacity++;
            MgmtVo[] temp = store;
            store = new MgmtVo[capacity];
            System.arraycopy(temp, 0, store, 0, usage);
        }
        store[usage] = value;
        usage++;
        return true;
    }

    public MgmtVo[] getMgmtFineList() {
        if(isEmpty()) { return null; }

        MgmtVo[] retArr = new MgmtVo[store.length];
        MgmtVo retVo = null;
        for(int i = 0; i < store.length; ++i) {
            retVo = new MgmtVo();
            retVo.setPRN_NM(store[i].getPRN_NM());
            retVo.setFINE(store[i].getFINE());
            retArr[i] = retVo;
        }
        return retArr;
    }

    public MgmtVo[] getMgmtList() {
        if(isEmpty()) { return null; }

        MgmtVo[] retArr = new MgmtVo[store.length];
        MgmtVo retVo = null;
        for(int i = 0; i < store.length; ++i) {
            retVo = new MgmtVo();
            retVo.setPRN_NM(store[i].getPRN_NM());
            retVo.setDPST(store[i].getDPST());
            retVo.setCHPT_YN(store[i].getCHPT_YN());
            retVo.setASGMT_YN(store[i].getASGMT_YN());
            retVo.setATN_INTRM_CHK_YN(store[i].getATN_INTRM_CHK_YN());
            retVo.setATN_WEEK_CHK_YN(store[i].getATN_WEEK_CHK_YN());
            retVo.setFINE(store[i].getFINE());
            retVo.setBLNC(store[i].getBLNC());
            retArr[i] = retVo;
        }
        return retArr;
    }
}
