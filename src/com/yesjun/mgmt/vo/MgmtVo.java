package com.yesjun.mgmt.vo;

public class MgmtVo {
    private String PRN_NM;              // �����(�̸�)
    private String DPST;                // ������
    private String CHPT_YN;             // é������ ����
    private String ASGMT_YN;            // ���� ����
    private String ATN_INTRM_CHK_YN;    // �߰��������� ����
    private String ATN_WEEK_CHK_YN;     // 1������������ ����
    private String FINE;                // ����
    private String BLNC;                // �ܾ�

    public MgmtVo() {
        super();
        this.DPST = "0";
        this.FINE = "0";
        this.BLNC = "0";
    }

    public String getPRN_NM() {
        return PRN_NM;
    }

    public void setPRN_NM(String PRN_NM) {
        this.PRN_NM = PRN_NM;
    }

    public String getDPST() {
        return DPST;
    }

    public void setDPST(String DPST) {
        this.DPST = DPST;
    }

    public String getCHPT_YN() {
        return CHPT_YN;
    }

    public void setCHPT_YN(String CHPT_YN) {
        this.CHPT_YN = CHPT_YN;
    }

    public String getASGMT_YN() {
        return ASGMT_YN;
    }

    public void setASGMT_YN(String ASGMT_YN) {
        this.ASGMT_YN = ASGMT_YN;
    }

    public String getATN_INTRM_CHK_YN() {
        return ATN_INTRM_CHK_YN;
    }

    public void setATN_INTRM_CHK_YN(String ATN_INTRM_CHK_YN) {
        this.ATN_INTRM_CHK_YN = ATN_INTRM_CHK_YN;
    }

    public String getATN_WEEK_CHK_YN() {
        return ATN_WEEK_CHK_YN;
    }

    public void setATN_WEEK_CHK_YN(String ATN_WEEK_CHK_YN) {
        this.ATN_WEEK_CHK_YN = ATN_WEEK_CHK_YN;
    }

    public String getFINE() {
        return FINE;
    }

    public void setFINE(String FINE) {
        this.FINE = FINE;
    }

    public String getBLNC() {
        return BLNC;
    }

    public void setBLNC(String BLNC) {
        this.BLNC = BLNC;
    }

    @Override
    public String toString() {
        return "";
    }
}
