package com.company.gof23.abstract1;

public class huWei implements iPhone{
    @Override
    public void start() {
        System.out.print("华为开机");
    }

    @Override
    public void shut() {
        System.out.print("华为关机");
    }
}
