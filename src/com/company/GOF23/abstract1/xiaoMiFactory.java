package com.company.gof23.abstract1;

public class xiaoMiFactory implements product{
    @Override
    public iPhone iPhone() {
        return new xiaoMi();
    }

    @Override
    public iRoute iRoute() {
        return new xiaoMiRouter();
    }
}
