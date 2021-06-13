package com.yesjun.mgmt.view;

import com.yesjun.mgmt.beans.StudyInfoServiceFactory;
import com.yesjun.mgmt.beans.UserServiceFactory;
import com.yesjun.mgmt.service.StudyInfoService;
import com.yesjun.mgmt.service.UserService;

import java.util.Scanner;

public abstract class BaseVw implements IMgmtVw {
    private Scanner sc;
    protected UserService userService;
    protected StudyInfoService studyInfoService;

    public BaseVw() {
        sc = new Scanner(System.in);
        userService = UserServiceFactory.getInstance();
        studyInfoService = StudyInfoServiceFactory.getInstance();
    }

    protected int scanInt(String msg) {
        System.out.print(msg);
        return Integer.parseInt(sc.nextLine());
    }

    protected String scanStr(String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
}
