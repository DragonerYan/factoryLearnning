package com.company.gof23.builder;

import com.company.gof23.builder.builder;

public class worker extends builder{

    private product product;


    @Override
    void builderA() {
        product.setBuildA("地基");
    }

    @Override
    void builderB() {
        product.setBuildB("钢筋");
    }

    @Override
    void builderC() {
        product.setBuildC("水泥");
    }

    @Override
    void builderD() {
        product.setBuildD("工人");
    }

    @Override
    protected void getP() {
        System.out.println("git 提交测试");
        System.out.println("git change remote branch");
        System.out.println("");
    }
}
