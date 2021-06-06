package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.MgmtVo;

public class SelectView extends BaseView {
    @Override
    public void process() {
        try {
            MgmtVo[] mgmtList = service.select();
            String SUM_DPST = "0";
            String SUM_FINE = "0";
            String SUM_BLNC = "0";

            System.out.println("======================================================================");
            System.out.println("                           ���͵� ����                                 ");
            System.out.println("======================================================================");
            System.out.println("\t\t������\té������\t����\t�߰���������\t1������������\t\t����\t\t�ܾ�");
            System.out.println("----------------------------------------------------------------------");

            if(mgmtList != null) {
                for (MgmtVo mgmtVo : mgmtList) {
                    SUM_DPST = (Integer.parseInt(SUM_DPST) + Integer.parseInt(mgmtVo.getDPST())) + "";
                    SUM_FINE = (Integer.parseInt(SUM_FINE) + Integer.parseInt(mgmtVo.getFINE())) + "";
                    SUM_BLNC = (Integer.parseInt(SUM_BLNC) + Integer.parseInt(mgmtVo.getBLNC())) + "";

                    System.out.print(mgmtVo.getPRN_NM() + "\t\t");
                    System.out.print(mgmtVo.getDPST() + "\t");
                    System.out.print(mgmtVo.getCHPT_YN() + "\t\t");
                    System.out.print(mgmtVo.getASGMT_YN() + "\t");
                    System.out.print(mgmtVo.getATN_INTRM_CHK_YN() + "\t\t\t");
                    System.out.print(mgmtVo.getATN_WEEK_CHK_YN() + "\t\t\t\t");
                    System.out.print(mgmtVo.getFINE() + "\t");
                    System.out.print(mgmtVo.getBLNC() + "\n");
                    System.out.println("----------------------------------------------------------------------");
                }
                System.out.println("\t�� ������ " + SUM_DPST + ", �� ���� " + SUM_FINE + ", �� �ܾ� " + SUM_BLNC);
            } else {
                System.out.println("��ȸ�� ������ �����ϴ�.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
