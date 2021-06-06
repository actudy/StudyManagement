package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.MgmtVo;

public class InsertView extends BaseView {
    @Override
    public void process() {
        try {
            System.out.println("1.정보입력");
            String PRN_NM = scanStr("이름 : ");
            String DPST = scanStr("보증금 : ");
            String CHPT_YN = scanStr("챕터정리 : ");
            String ASGMT_YN = scanStr("과제 : ");
            String ATN_INTRM_CHK_YN = scanStr("중간점검참석 : ");
            String ATN_WEEK_CHK_YN = scanStr("1주일점검참석 : ");

            MgmtVo mgmtVo = new MgmtVo();
            mgmtVo.setPRN_NM(PRN_NM);
            mgmtVo.setDPST(DPST);
            mgmtVo.setCHPT_YN(CHPT_YN);
            mgmtVo.setASGMT_YN(ASGMT_YN);
            mgmtVo.setATN_INTRM_CHK_YN(ATN_INTRM_CHK_YN);
            mgmtVo.setATN_WEEK_CHK_YN(ATN_WEEK_CHK_YN);

            service.insert(mgmtVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
