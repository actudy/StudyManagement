package com.yesjun.mgmt.dao;

import com.yesjun.mgmt.repository.MgmtRepository;
import com.yesjun.mgmt.vo.MgmtVo;

public class MgmtDao {
    MgmtRepository mgmtReposiotry = null;

    public MgmtDao() {
        mgmtReposiotry = new MgmtRepository();
    }

    public void insert(MgmtVo mgmtVo) { mgmtReposiotry.push(mgmtVo); }

    public MgmtVo[] selectFine() { return mgmtReposiotry.getMgmtFineList(); }

    public MgmtVo[] select() {
        return mgmtReposiotry.getMgmtList();
    }
}
