package com.yesjun.mgmt.view;

public class TerminateView extends BaseView {
    @Override
    public void process() {
        System.out.println("����!");
        service.terminate();
    }
}
