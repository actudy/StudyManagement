package com.yesjun.mgmt.view;

import com.yesjun.mgmt.common.MgmtServiceFactory;
import com.yesjun.mgmt.service.MgmtService;

import java.util.Scanner;

public abstract class BaseView implements IMgmtView {
    private Scanner sc;
    protected MgmtService service;

    public BaseView() {
        sc = new Scanner(System.in);
        service = MgmtServiceFactory.getInstance();
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
