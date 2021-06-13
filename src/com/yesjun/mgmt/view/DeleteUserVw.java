package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.UserVo;

public class DeleteUserVw extends BaseVw {
    @Override
    public void process() {
        UserVo user = null;

        try {
            System.out.println("4.���͵�Ż��");
            String MGMT_NUM = scanStr("ȸ����ȣ : ");

            user = userService.getUser(MGMT_NUM);
            if(user == null) {
                System.out.println("ȸ����ȣ [" + MGMT_NUM + "]�� �������� �ʽ��ϴ�.");
                process();
            }

            userService.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
