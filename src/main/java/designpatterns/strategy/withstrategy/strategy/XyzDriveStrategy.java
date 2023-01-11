package designpatterns.strategy.withstrategy.strategy;

public class XyzDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("xyz drive capability");
    }
}
