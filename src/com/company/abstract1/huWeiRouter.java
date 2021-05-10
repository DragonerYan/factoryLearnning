package com.company.abstract1;

public class huWeiRouter implements iRoute{

    @Override
    public void start() {
        System.out.print("华为路由器开机");
    }

    @Override
    public void shut() {
        System.out.print("华为路由器关机");
    }
}
