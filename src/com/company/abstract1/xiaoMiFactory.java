package com.company.abstract1;

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
