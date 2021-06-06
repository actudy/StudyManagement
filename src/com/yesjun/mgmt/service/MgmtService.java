package com.yesjun.mgmt.service;

import com.yesjun.mgmt.dao.MgmtDao;
import com.yesjun.mgmt.vo.MgmtVo;

public class MgmtService {
    private MgmtDao dao;

    public MgmtService() {
        dao = new MgmtDao();
    }

    public void insert(MgmtVo mgmtVo) {
        if(mgmtVo.getATN_INTRM_CHK_YN().equalsIgnoreCase("x")) {
            mgmtVo.setFINE((Integer.parseInt(mgmtVo.getFINE()) + 1000) + "");
        }
        if(mgmtVo.getATN_WEEK_CHK_YN().equalsIgnoreCase("x")) {
            mgmtVo.setFINE((Integer.parseInt(mgmtVo.getFINE()) + 1000) + "");
        }
        mgmtVo.setBLNC((Integer.parseInt(mgmtVo.getDPST()) - Integer.parseInt(mgmtVo.getFINE())) + "");
        dao.insert(mgmtVo);
    }

    public MgmtVo[] selectFine() { return dao.selectFine(); }

    public MgmtVo[] select() { return dao.select(); }

    public void terminate() { System.exit(0); }
}
