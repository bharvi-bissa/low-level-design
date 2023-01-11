package designpatterns.strategy.withstrategy;


import designpatterns.strategy.withstrategy.strategy.SportsDriveStrategy;

class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

    @Override
    public void drive() { //duplicate code - same in SUV
        System.out.println("sports drive capability");
    }
}
