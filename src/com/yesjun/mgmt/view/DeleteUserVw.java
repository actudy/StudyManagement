package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.UserVo;

public class DeleteUserVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;

        try {
            System.out.println("4.스터디탈퇴");
            String MGMT_NUM = scanStr("회원번호 : ");

            user = userService.getUser(MGMT_NUM);
            if(user == null) {
                System.out.println("회원번호 [" + MGMT_NUM + "]가 존재하지 않습니다.");
                process();
            }

            userService.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
