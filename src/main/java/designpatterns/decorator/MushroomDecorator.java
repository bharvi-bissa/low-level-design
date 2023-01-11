package designpatterns.decorator;

import designpatterns.decorator.base.BasePizza;

class MushroomDecorator implements ToppingDecorator{

    BasePizza basePizza;

    public MushroomDecorator(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}