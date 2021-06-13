package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class InsertStudyInfoVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;
        StudyInfoVo studyInfo = null;

        try {
            studyInfo = new StudyInfoVo();

            System.out.println("2.�����Է�");
            String MGMT_NUM = scanStr("ȸ����ȣ �Է� : ");

            user = userService.getUser(MGMT_NUM);
            if(user == null) {
                System.out.println("ȸ����ȣ [" + MGMT_NUM + "]�� �������� �ʽ��ϴ�.");
                return;
            }

            studyInfo.setMGMT_NUM(user.getMGMT_NUM());
            System.out.println("�̸� : " + user.getPRN_NM());
            String STDY_DT = scanStr("���͵�¥ : ");
            String CHPT_YN = scanStr("é������ : ");
            String ASGMT_YN = scanStr("���� : ");
            String ATN_INTRM_CHK_YN = scanStr("�߰��������� : ");
            String ATN_WEEK_CHK_YN = scanStr("1������������ : ");

            studyInfo.setSTDY_DT(STDY_DT);
            studyInfo.setCHPT_YN(CHPT_YN);
            studyInfo.setASGMT_YN(ASGMT_YN);
            studyInfo.setATN_INTRM_CHK_YN(ATN_INTRM_CHK_YN);
            studyInfo.setATN_WEEK_CHK_YN(ATN_WEEK_CHK_YN);

            studyInfoService.insertStudyInfo(studyInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
