package src.ObjectPool;

import src.Entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarTaxi {
    private List<Car> cars;


    public CarTaxi() {
        cars = new ArrayList<>();
    }

    public void registerCar(Car car) {
        cars.add(car);
    }

    public Car rentCar(int index) {
        Car carRent = cars.remove(index);
        return carRent;
    }

    public void returnCar(Car car) {
        cars.add(car);
    }

    public void showCurrentCar() {
        System.out.println("Current cars in the taxi: ");
        for (Car car : cars) {
            System.out.println(car.name);
        }
    }


}
