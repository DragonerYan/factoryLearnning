package com.company.builder;

import java.sql.SQLOutput;

public class worker extends builder{

    private product product;

    public worker() {
        product =new product();
    }

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
    }
}
