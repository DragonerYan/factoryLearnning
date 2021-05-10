package com.company.abstract1;

import sun.awt.geom.AreaOp;

public class client {
    public static void main(String[] args) {
        System.out.println("小米系列产品");
        xiaoMiFactory xiaoMiFactory=new xiaoMiFactory();
        iPhone iPhone=xiaoMiFactory.iPhone();
        iPhone.shut();
        iPhone.start();
    }
}
