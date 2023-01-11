package designpatterns.strategy.withoutstrategy;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() { //duplicate code - same in SUV
        System.out.println("sports drive capability");
    }
}
