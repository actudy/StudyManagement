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
        System.out.println("�޴�");
        System.out.println("\t1.���͵���");
        System.out.println("\t2.�����Է�");
        System.out.println("\t3.��������");
        System.out.println("\t4.���͵�Ż��");
        System.out.println("\t5.������Ȳ");
        System.out.println("\t6.���͵��������");
        System.out.println("\t7.����");
        int type = scanInt("-> ");
        return type;
    }
}
