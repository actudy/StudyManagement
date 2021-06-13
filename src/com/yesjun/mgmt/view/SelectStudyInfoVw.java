package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.CommonVo;

public class SelectStudyInfoVw extends BaseVw {
    @Override
    public void process() {
        try {
            CommonVo[] commonArr = studyInfoService.selectStudyInfo();
            String SUM_DPST = "0";
            String SUM_FINE = "0";
            String SUM_BLNC = "0";

            System.out.println("====================================================================================================");
            System.out.println("                                            스터디 관리                                              ");
            System.out.println("====================================================================================================");
            System.out.println("\t\t회원번호\t회원이름\t보증금\t스터디날짜\t챕터정리\t과제\t중간점검참석\t1주일점검참석\t\t벌금\t\t잔액");
            System.out.println("----------------------------------------------------------------------------------------------------");

            if(commonArr != null) {
                for (CommonVo common : commonArr) {
                    SUM_DPST = (Integer.parseInt(SUM_DPST) + Integer.parseInt(common.getDPST())) + "";
                    SUM_FINE = (Integer.parseInt(SUM_FINE) + Integer.parseInt(common.getFINE())) + "";
                    SUM_BLNC = (Integer.parseInt(SUM_BLNC) + Integer.parseInt(common.getBLNC())) + "";

                    System.out.print(common.getMGMT_NUM() + "\t");
                    System.out.print(common.getPRN_NM() + "\t");
                    System.out.print(common.getDPST() + "\t");
                    System.out.print(common.getSTDY_DT() + "\t");
                    System.out.print(common.getCHPT_YN() + "\t");
                    System.out.print(common.getASGMT_YN() + "\t");
                    System.out.print(common.getATN_INTRM_CHK_YN() + "\t");
                    System.out.print(common.getATN_WEEK_CHK_YN() + "\t");
                    System.out.print(common.getFINE() + "\t");
                    System.out.print(common.getBLNC() + "\n");
                    System.out.println("----------------------------------------------------------------------------------------------------");
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
