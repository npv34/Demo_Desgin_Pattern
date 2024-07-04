package src.Factory;

import src.Entity.Bike;
import src.Entity.Car;
import src.Entity.MotoBike;

public class BikeFactory {
    public Object getBike(int type) {
        switch (type) {
            case 1:
                return new Bike(1, "Bike");
            case 2:
                return new MotoBike(1, "Moto");
            case 3:
                return new Car(1, "Car");
            default:
                System.out.println("Invalid choice");
        }
        return null;
    }
}
