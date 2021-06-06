package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.MgmtVo;

public class SelectFineView extends BaseView {
    @Override
    public void process() {
        try {
            MgmtVo[] mgmtList = service.selectFine();
            String SUM_FINE = "0";

            System.out.println("======================================================================");
            System.out.println("                             ���� ����                                ");
            System.out.println("======================================================================");
            System.out.println("\t\t����");
            System.out.println("----------------------------------------------------------------------");

            if(mgmtList != null) {
                for (MgmtVo mgmtVo : mgmtList) {
                    SUM_FINE = (Integer.parseInt(SUM_FINE) + Integer.parseInt(mgmtVo.getFINE())) + "";

                    System.out.print(mgmtVo.getPRN_NM() + "\t\t");
                    System.out.println(mgmtVo.getFINE() + "\t");
                    System.out.println("----------------------------------------------------------------------");
                }
                System.out.println("\t�� ���� " + SUM_FINE);
            } else {
                System.out.println("��ȸ�� ������ �����ϴ�.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
