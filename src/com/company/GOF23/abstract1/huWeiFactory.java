package com.company.gof23.abstract1;

public class huWeiFactory implements product{
    @Override
    public iPhone iPhone() {
        return new huWei();
    }

    @Override
    public iRoute iRoute() {
        return new huWeiRouter();
    }
}
