package com.company.abstract1;

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
