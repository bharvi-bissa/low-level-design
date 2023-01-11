package designpatterns.strategy.withstrategy;

import designpatterns.strategy.withstrategy.strategy.DriveStrategy;
import designpatterns.strategy.withstrategy.strategy.SportsDriveStrategy;

class SUV extends Vehicle {

    SUV() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive() {
        System.out.println("sports drive capability");
    }
}
