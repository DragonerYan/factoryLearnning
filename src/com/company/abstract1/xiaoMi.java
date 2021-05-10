package com.company.abstract1;

public class xiaoMi implements iPhone{
    @Override
    public void start() {
        System.out.print("小米开机");
    }

    @Override
    public void shut() {
        System.out.print("小米关机");
    }
}
