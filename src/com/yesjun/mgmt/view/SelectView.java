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
            System.out.println("                           스터디 관리                                 ");
            System.out.println("======================================================================");
            System.out.println("\t\t보증금\t챕터정리\t과제\t중간점검참석\t1주일점검참석\t\t벌금\t\t잔액");
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
                System.out.println("\t총 보증금 " + SUM_DPST + ", 총 벌금 " + SUM_FINE + ", 총 잔액 " + SUM_BLNC);
            } else {
                System.out.println("조회된 정보가 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
