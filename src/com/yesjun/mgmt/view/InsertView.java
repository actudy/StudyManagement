package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.MgmtVo;

public class InsertView extends BaseView {
    @Override
    public void process() {
        try {
            System.out.println("1.�����Է�");
            String PRN_NM = scanStr("�̸� : ");
            String DPST = scanStr("������ : ");
            String CHPT_YN = scanStr("é������ : ");
            String ASGMT_YN = scanStr("���� : ");
            String ATN_INTRM_CHK_YN = scanStr("�߰��������� : ");
            String ATN_WEEK_CHK_YN = scanStr("1������������ : ");

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
