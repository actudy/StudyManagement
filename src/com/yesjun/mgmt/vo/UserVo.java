package com.yesjun.mgmt.vo;

public class UserVo {
    private String MGMT_NUM;    // ������ȣ
    private String PRN_NM;      // �̸�
    private String DPST;        // ������
    private String RGST_DT;     // ���Գ�¥
    private String WTDRW_YN;    // Ż�𿩺�

    public UserVo() {
        super();
        this.DPST = "0";
    }

    public String getMGMT_NUM() {
        return MGMT_NUM;
    }

    public void setMGMT_NUM(String MGMT_NUM) {
        this.MGMT_NUM = MGMT_NUM;
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

    public String getRGST_DT() {
        return RGST_DT;
    }

    public void setRGST_DT(String RGST_DT) {
        this.RGST_DT = RGST_DT;
    }

    public String getWTDRW_YN() { return WTDRW_YN; }

    public void setWTDRW_YN(String WTDRW_YN) { this.WTDRW_YN = WTDRW_YN; }

    @Override
    public String toString() {
        return "UserVo{" +
                "MGMT_NUM='" + MGMT_NUM + '\'' +
                ", PRN_NM='" + PRN_NM + '\'' +
                ", DPST='" + DPST + '\'' +
                ", RGST_DT='" + RGST_DT + '\'' +
                '}';
    }
}
