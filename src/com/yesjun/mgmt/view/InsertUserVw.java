package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class InsertUserVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;

        try {
            System.out.println("1.���͵���");
            String MGMT_NUM = scanStr("ȸ����ȣ : ");

            if(userService.getUser(MGMT_NUM) != null) {
                System.out.println("ȸ����ȣ [" + MGMT_NUM + "]�� �̹� �����մϴ�.");
                process();
            }
            user = new UserVo();
            user.setMGMT_NUM(MGMT_NUM);
            String PRN_NM = scanStr("�̸� : ");
            user.setPRN_NM(PRN_NM);

            String DPST = scanStr("������ : ");
            String RGST_DT = scanStr("���Գ�¥ : ");
            user.setDPST(DPST);
            user.setRGST_DT(RGST_DT);

            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
