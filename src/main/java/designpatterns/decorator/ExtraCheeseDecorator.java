package designpatterns.decorator;

import designpatterns.decorator.base.BasePizza;

class ExtraCheeseDecorator implements ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheeseDecorator(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
