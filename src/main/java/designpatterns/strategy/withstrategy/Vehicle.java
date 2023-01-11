package designpatterns.strategy.withstrategy;

import designpatterns.strategy.withstrategy.strategy.DriveStrategy;

 class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        System.out.println("normal drive capability");
    }
}
