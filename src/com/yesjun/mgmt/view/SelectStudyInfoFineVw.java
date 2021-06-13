package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.CommonVo;

public class SelectStudyInfoFineVw extends BaseVw {
    @Override
    public void process() {
        try {
            CommonVo[] commonArr = studyInfoService.selectStudyInfoFine();
            String SUM_FINE = "0";

            System.out.println("======================================================================");
            System.out.println("                             벌금 내역                                ");
            System.out.println("======================================================================");
            System.out.println("\t\t회원번호\t회원이름\t스터디날짜\t벌금");
            System.out.println("----------------------------------------------------------------------");

            if(commonArr != null) {
                for (CommonVo common : commonArr) {
                    SUM_FINE = (Integer.parseInt(SUM_FINE) + Integer.parseInt(common.getFINE())) + "";

                    System.out.print(common.getMGMT_NUM() + "\t");
                    System.out.print(common.getPRN_NM() + "\t");
                    System.out.print(common.getSTDY_DT() + "\t");
                    System.out.println(common.getFINE() + "\t");
                    System.out.println("----------------------------------------------------------------------");
                }
                System.out.println("\t총 벌금 " + SUM_FINE);
            } else {
                System.out.println("조회된 정보가 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
