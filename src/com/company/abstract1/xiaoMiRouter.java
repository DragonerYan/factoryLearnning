package com.company.abstract1;

public class xiaoMiRouter implements iRoute{
    @Override
    public void start() {
        System.out.print("小米路由器开机");
    }

    @Override
    public void shut() {
        System.out.print("小米路由器关机");
    }
}
