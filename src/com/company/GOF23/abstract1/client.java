package com.company.gof23.abstract1;

public class client {
    public static void main(String[] args) {
        System.out.println("小米系列产品");
        xiaoMiFactory xiaoMiFactory=new xiaoMiFactory();
        iPhone iPhone=xiaoMiFactory.iPhone();
        iPhone.shut();
        iPhone.start();
    }
}
