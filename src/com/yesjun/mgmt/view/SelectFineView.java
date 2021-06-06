package com.yesjun.mgmt.view;

import com.yesjun.mgmt.vo.MgmtVo;

public class SelectFineView extends BaseView {
    @Override
    public void process() {
        try {
            MgmtVo[] mgmtList = service.selectFine();
            String SUM_FINE = "0";

            System.out.println("======================================================================");
            System.out.println("                             ¹ú±Ý ³»¿ª                                ");
            System.out.println("======================================================================");
            System.out.println("\t\t¹ú±Ý");
            System.out.println("----------------------------------------------------------------------");

            if(mgmtList != null) {
                for (MgmtVo mgmtVo : mgmtList) {
                    SUM_FINE = (Integer.parseInt(SUM_FINE) + Integer.parseInt(mgmtVo.getFINE())) + "";

                    System.out.print(mgmtVo.getPRN_NM() + "\t\t");
                    System.out.println(mgmtVo.getFINE() + "\t");
                    System.out.println("----------------------------------------------------------------------");
                }
                System.out.println("\tÃÑ ¹ú±Ý " + SUM_FINE);
            } else {
                System.out.println("Á¶È¸µÈ Á¤º¸°¡ ¾ø½À´Ï´Ù.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("");
    }
}
