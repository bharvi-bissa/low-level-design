package designpatterns.decorator;

import designpatterns.decorator.base.BasePizza;

public class VegDelight implements BasePizza {

    @Override
    public int cost() {
        return 250;
    }
}
