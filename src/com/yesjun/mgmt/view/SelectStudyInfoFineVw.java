package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.CommonVo;

public class SelectStudyInfoFineVw extends BaseVw {
    @Override
    public void process() {
        try {
            CommonVo[] commonArr = studyInfoService.selectStudyInfoFine();
            String SUM_FINE = "0";

            System.out.println("======================================================================");
            System.out.println("                             ���� ����                                ");
            System.out.println("======================================================================");
            System.out.println("\t\tȸ����ȣ\tȸ���̸�\t���͵�¥\t����");
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
