package com.yesjun.mgmt.view;

import com.yesjun.mgmt.config.MgmtViewMapping;

public class MainView extends BaseView {
    String[] key = { "", "insert", "selectFine", "select", "terminate" };

    @Override
    public void process() {
        MgmtViewMapping mapping = new MgmtViewMapping();

        while(true) {
            int type = menu();
            if(type >= key.length) {
                System.out.println("");
                continue;
            }

            IMgmtView view = mapping.getMgmtView(key[type]);
            if(view != null) {
                view.process();
            }
        }
    }

    private int menu() {
        System.out.println("메뉴");
        System.out.println("\t1.정보입력");
        System.out.println("\t2.벌금내역");
        System.out.println("\t3.스터디관리");
        System.out.println("\t4.종료");
        int type = scanInt("-> ");
        return type;
    }
}
