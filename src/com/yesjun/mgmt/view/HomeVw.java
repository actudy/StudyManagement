package com.yesjun.mgmt.view;

import com.yesjun.mgmt.config.MgmtViewMapping;

public class HomeVw extends BaseVw {
    String[] key = {
            "",
            "insertUser",
            "insertStudyInfo",
            "updateStudyInfo",
            "deleteUser",
            "selectStudyInfoFine",
            "selectSutdyInfo",
            "terminate"
    };

    @Override
    public void process() {
        MgmtViewMapping mapping = new MgmtViewMapping();

        while(true) {
            int type = menu();
            if(type >= key.length) {
                System.out.println("");
                continue;
            }

            IMgmtVw view = mapping.getMgmtView(key[type]);
            if(view != null) {
                view.process();
            }
        }
    }

    private int menu() {
        System.out.println("메뉴");
        System.out.println("\t1.스터디가입");
        System.out.println("\t2.정보입력");
        System.out.println("\t3.정보수정");
        System.out.println("\t4.스터디탈퇴");
        System.out.println("\t5.벌금현황");
        System.out.println("\t6.스터디관리내용");
        System.out.println("\t7.종료");
        int type = scanInt("-> ");
        return type;
    }
}
