package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.StudyInfoVo;
import com.yesjun.mgmt.vo.UserVo;

public class InsertUserVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;

        try {
            System.out.println("1.스터디가입");
            String MGMT_NUM = scanStr("회원번호 : ");

            if(userService.getUser(MGMT_NUM) != null) {
                System.out.println("회원번호 [" + MGMT_NUM + "]가 이미 존재합니다.");
                process();
            }
            user = new UserVo();
            user.setMGMT_NUM(MGMT_NUM);
            String PRN_NM = scanStr("이름 : ");
            user.setPRN_NM(PRN_NM);

            String DPST = scanStr("보증금 : ");
            String RGST_DT = scanStr("가입날짜 : ");
            user.setDPST(DPST);
            user.setRGST_DT(RGST_DT);

            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
