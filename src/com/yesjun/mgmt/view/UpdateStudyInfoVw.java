package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class UpdateStudyInfoVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;
        StudyInfoVo studyInfo = null;

        try {
            studyInfo = new StudyInfoVo();

            System.out.println("3.정보수정");
            String MGMT_NUM = scanStr("회원번호 입력 : ");

            user = userService.getUser(MGMT_NUM);
            if(user == null) {
                System.out.println("회원번호 [" + MGMT_NUM + "]가 존재하지 않습니다.");
                return;
            }

            studyInfo.setMGMT_NUM(user.getMGMT_NUM());
            System.out.println("이름 : " + user.getPRN_NM());
            String STDY_DT = scanStr("스터디날짜 : ");
            String CHPT_YN = scanStr("챕터정리 : ");
            String ASGMT_YN = scanStr("과제 : ");
            String ATN_INTRM_CHK_YN = scanStr("중간점검참석 : ");
            String ATN_WEEK_CHK_YN = scanStr("1주일점검참석 : ");

            studyInfo.setSTDY_DT(STDY_DT);
            studyInfo.setCHPT_YN(CHPT_YN);
            studyInfo.setASGMT_YN(ASGMT_YN);
            studyInfo.setATN_INTRM_CHK_YN(ATN_INTRM_CHK_YN);
            studyInfo.setATN_WEEK_CHK_YN(ATN_WEEK_CHK_YN);

            studyInfoService.updateStudyInfo(studyInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
