package com.yesjun.mgmt.dao;

import com.yesjun.mgmt.beans.StudyInfoRepositoryFactory;
import com.yesjun.mgmt.beans.UserRepositoryFactory;
import com.yesjun.mgmt.repository.MGMT_STUDY_INFO;
import com.yesjun.mgmt.repository.MGMT_USER;
import com.yesjun.mgmt.util.Dictionary;
import com.yesjun.mgmt.vo.CommonVo;
import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class StudyInfoDao {
    MGMT_STUDY_INFO studyInfoRepo = null;
    MGMT_USER userRepo = null;

    public StudyInfoDao() {
        studyInfoRepo = StudyInfoRepositoryFactory.getInstance();
        userRepo = UserRepositoryFactory.getInstance();
    }

    public void insertStudyInfo(StudyInfoVo studyInfo) { studyInfoRepo.push(studyInfo); }

    public void updateStudyInfo(StudyInfoVo studyInfo) { studyInfoRepo.updateStudyInfo(studyInfo); }

    public CommonVo[] selectStudyInfo() {
        String MGMT_NUM = "";
        CommonVo[] commonArr = null;
        CommonVo common = null;
        int idx = 0;
        UserVo user = null;
        StudyInfoVo[] studyInfoRetArr = studyInfoRepo.getList();
        commonArr = new CommonVo[studyInfoRetArr.length];

        for(StudyInfoVo studyInfoRet : studyInfoRetArr) {
            common = new CommonVo();
            MGMT_NUM = studyInfoRet.getMGMT_NUM();
            user = userRepo.getUser(MGMT_NUM);

            if(user.getWTDRW_YN().equals("Y")) { continue; }

            common.setMGMT_NUM(MGMT_NUM);
            common.setPRN_NM(user.getPRN_NM());
            common.setDPST(user.getDPST());
            common.setRGST_DT(user.getRGST_DT());
            common.setSTDY_DT(studyInfoRet.getSTDY_DT());
            common.setCHPT_YN(studyInfoRet.getCHPT_YN());
            common.setASGMT_YN(studyInfoRet.getASGMT_YN());
            common.setATN_INTRM_CHK_YN(studyInfoRet.getATN_INTRM_CHK_YN());
            common.setATN_WEEK_CHK_YN(studyInfoRet.getATN_WEEK_CHK_YN());
            common.setFINE(studyInfoRet.getFINE());
            common.setBLNC(studyInfoRet.getBLNC());
            commonArr[idx++] = common;
        }
        return resize(commonArr, idx);
    }

    public CommonVo[] selectStudyInfoFine() {
        String MGMT_NUM = "";
        CommonVo[] commonArr = null;
        CommonVo common = null;
        int idx = 0;
        UserVo user = null;
        StudyInfoVo[] studyInfoRetArr = studyInfoRepo.getList();
        commonArr = new CommonVo[studyInfoRetArr.length];

        for(StudyInfoVo studyInfoRet : studyInfoRetArr) {
            common = new CommonVo();
            MGMT_NUM = studyInfoRet.getMGMT_NUM();
            user = userRepo.getUser(MGMT_NUM);
            common.setMGMT_NUM(MGMT_NUM);
            common.setPRN_NM(user.getPRN_NM());
            common.setSTDY_DT(studyInfoRet.getSTDY_DT());
            common.setFINE(studyInfoRet.getFINE());
            commonArr[idx++] = common;
        }

        return commonArr;
    }

    private CommonVo[] resize(CommonVo[] commonArr, int size) {
        CommonVo[] resizeArr = new CommonVo[size];
        System.arraycopy(commonArr, 0, resizeArr, 0, size);
        return resizeArr;
    }
}
