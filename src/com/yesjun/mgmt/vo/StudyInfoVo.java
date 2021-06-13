package com.yesjun.mgmt.vo;

public class StudyInfoVo {
    private String MGMT_NUM;            // 관리번호
    private String STDY_DT;             // 스터디 날짜
    private String CHPT_YN;             // 챕터정리 여부
    private String ASGMT_YN;            // 과제 여부
    private String ATN_INTRM_CHK_YN;    // 중간점검참석 여부
    private String ATN_WEEK_CHK_YN;     // 1주일점검참석 여부
    private String FINE;                // 벌금
    private String BLNC;                // 잔액

    public StudyInfoVo() {
        super();
        this.FINE = "0";
        this.BLNC = "0";
    }

    public String getMGMT_NUM() {
        return MGMT_NUM;
    }

    public void setMGMT_NUM(String MGMT_NUM) {
        this.MGMT_NUM = MGMT_NUM;
    }

    public String getSTDY_DT() {
        return STDY_DT;
    }

    public void setSTDY_DT(String STDY_DT) { this.STDY_DT = STDY_DT; }

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
        return "StudyInfoVo{" +
                "MGMT_NUM='" + MGMT_NUM + '\'' +
                ", STDY_DT='" + STDY_DT + '\'' +
                ", CHPT_YN='" + CHPT_YN + '\'' +
                ", ASGMT_YN='" + ASGMT_YN + '\'' +
                ", ATN_INTRM_CHK_YN='" + ATN_INTRM_CHK_YN + '\'' +
                ", ATN_WEEK_CHK_YN='" + ATN_WEEK_CHK_YN + '\'' +
                ", FINE='" + FINE + '\'' +
                ", BLNC='" + BLNC + '\'' +
                '}';
    }
}
