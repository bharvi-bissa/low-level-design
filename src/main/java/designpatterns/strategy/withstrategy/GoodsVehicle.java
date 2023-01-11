package designpatterns.strategy.withstrategy;

import designpatterns.strategy.withstrategy.strategy.DriveStrategy;
import designpatterns.strategy.withstrategy.strategy.NormalDriveStrategy;

class GoodsVehicle extends Vehicle {

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
