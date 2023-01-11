package designpatterns.strategy.withstrategy;

public class Main {

    public static void main(String[] args) {

        GoodsVehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        SUV sportsVehicle = new SUV();
        sportsVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();



    }
}
