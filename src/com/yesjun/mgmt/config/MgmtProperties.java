package com.yesjun.mgmt.config;

public class MgmtProperties {
    final String[] keys = {
            "insertUser",
            "insertStudyInfo",
            "updateStudyInfo",
            "deleteUser",
            "selectStudyInfoFine",
            "selectSutdyInfo",
            "terminate"
    };
    final String[] values = {
            "com.yesjun.mgmt.view.InsertUserVw",
            "com.yesjun.mgmt.view.InsertStudyInfoVw",
            "com.yesjun.mgmt.view.UpdateStudyInfoVw",
            "com.yesjun.mgmt.view.DeleteUserVw",
            "com.yesjun.mgmt.view.SelectStudyInfoFineVw",
            "com.yesjun.mgmt.view.SelectStudyInfoVw",
            "com.yesjun.mgmt.view.TerminateVw",
    };

    public int size() {
        return keys.length;
    }

    public String[] keys() {
        return keys;
    }

    public String get(String key) {
        return values[getIndexByKey(key)];
    }

    private int getIndexByKey(String key) {
        for(int i = 0; i < keys.length; ++i) {
            if(keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}
