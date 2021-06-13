package com.yesjun.mgmt.service;

import com.yesjun.mgmt.beans.StudyInfoDaoFactory;
import com.yesjun.mgmt.beans.UserDaoFactory;
import com.yesjun.mgmt.dao.StudyInfoDao;
import com.yesjun.mgmt.dao.UserDao;
import com.yesjun.mgmt.vo.CommonVo;
import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class StudyInfoService {
    private StudyInfoDao studyInfoDao;
    private UserDao userDao;

    public StudyInfoService() {
        studyInfoDao = StudyInfoDaoFactory.getInstance();
        userDao = UserDaoFactory.getInstance();
    }

    public void insertStudyInfo(StudyInfoVo studyInfo) {
        UserVo user = userDao.getUser(studyInfo.getMGMT_NUM());

        if(studyInfo.getATN_INTRM_CHK_YN().equalsIgnoreCase("x")) {
            studyInfo.setFINE((Integer.parseInt(studyInfo.getFINE()) + 1000) + "");
        }
        if(studyInfo.getATN_WEEK_CHK_YN().equalsIgnoreCase("x")) {
            studyInfo.setFINE((Integer.parseInt(studyInfo.getFINE()) + 1000) + "");
        }
        studyInfo.setBLNC((Integer.parseInt(user.getDPST()) - Integer.parseInt(studyInfo.getFINE())) + "");

        studyInfoDao.insertStudyInfo(studyInfo);
    }

    public void updateStudyInfo(StudyInfoVo studyInfo) {
        UserVo user = userDao.getUser(studyInfo.getMGMT_NUM());

        if(studyInfo.getATN_INTRM_CHK_YN().equalsIgnoreCase("x")) {
            studyInfo.setFINE((Integer.parseInt(studyInfo.getFINE()) + 1000) + "");
        }
        if(studyInfo.getATN_WEEK_CHK_YN().equalsIgnoreCase("x")) {
            studyInfo.setFINE((Integer.parseInt(studyInfo.getFINE()) + 1000) + "");
        }
        studyInfo.setBLNC((Integer.parseInt(user.getDPST()) - Integer.parseInt(studyInfo.getFINE())) + "");

        studyInfoDao.updateStudyInfo(studyInfo);
    }

    public CommonVo[] selectStudyInfo() { return studyInfoDao.selectStudyInfo(); }

    public CommonVo[] selectStudyInfoFine() { return studyInfoDao.selectStudyInfoFine(); }
}
