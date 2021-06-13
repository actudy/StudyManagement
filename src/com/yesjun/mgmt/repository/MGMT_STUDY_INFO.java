package com.yesjun.mgmt.repository;

import com.yesjun.mgmt.vo.StudyInfoVo;

public class MGMT_STUDY_INFO {
    StudyInfoVo[] stores;
    int capacity;
    int usage;

    public MGMT_STUDY_INFO() {
        stores = new StudyInfoVo[capacity];
        capacity = 0;
        usage = 0;
    }

    private boolean isFull() {
        return capacity == usage;
    }

    public boolean push(StudyInfoVo studyInfo) {
        if(isFull()) {
            capacity++;
            StudyInfoVo[] temp = stores;
            stores = new StudyInfoVo[capacity];
            System.arraycopy(temp, 0, stores, 0, usage);
        }
        stores[usage] = studyInfo;
        usage++;
        return true;
    }

    public void updateStudyInfo(StudyInfoVo studyInfo) {
        for(StudyInfoVo store : stores) {
            if(studyInfo.getMGMT_NUM() == store.getMGMT_NUM()) {
                store.setSTDY_DT(studyInfo.getSTDY_DT());
                store.setCHPT_YN(studyInfo.getCHPT_YN());
                store.setASGMT_YN(studyInfo.getASGMT_YN());
                store.setATN_INTRM_CHK_YN(studyInfo.getATN_INTRM_CHK_YN());
                store.setATN_WEEK_CHK_YN(studyInfo.getATN_WEEK_CHK_YN());
                store.setFINE(studyInfo.getFINE());
                store.setBLNC(studyInfo.getBLNC());
            }
        }
    }

    public StudyInfoVo[] getList() {
        return stores;
    }
}
