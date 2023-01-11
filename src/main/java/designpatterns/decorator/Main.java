package designpatterns.decorator;

import designpatterns.decorator.base.BasePizza;
import designpatterns.decorator.base.Farmhouse;
import designpatterns.decorator.base.Margharita;

public class Main {
    public static void main(String[] args) {
        //margharita + extracheese
        BasePizza pizza1 =  new ExtraCheeseDecorator((new Margharita()));
        System.out.println(pizza1.cost());

        //margharita + mushroom
        BasePizza pizza2 =  new MushroomDecorator((new Margharita()));
        System.out.println(pizza2.cost());

        //farmhouse + mushroom + extracheese
        BasePizza pizza3 =  new ExtraCheeseDecorator(new MushroomDecorator((new Farmhouse())));
        System.out.println(pizza3.cost());
    }
}
