import src.Entity.Car;
import src.ObjectPool.CarTaxi;
import src.Singleton.UserManager;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car(1, "Car 00");
        Car car2 = car1.cloneCar();
        Car car3 = car1.cloneCar();
        Car car4 = car1.cloneCar();

        CarTaxi car1Taxi = new CarTaxi();

        car1Taxi.registerCar(car1);
        car1Taxi.registerCar(car2);
        car1Taxi.registerCar(car3);
        car1Taxi.registerCar(car4);

        Car car00 = car1Taxi.rentCar(0);
        Car car01 = car1Taxi.rentCar(1);

        car1Taxi.returnCar(car00);
        car1Taxi.returnCar(car01);
        car1Taxi.showCurrentCar();

    }

    private static void updateUser() {
        UserManager userManager = UserManager.getInstance();
        userManager.updateUser();
    }

    private static void deleteUser() {
        UserManager userManager = UserManager.getInstance();
        userManager.removeUser(1);
    }

    private static void createUser() {
        UserManager userManager = UserManager.getInstance();
        userManager.addUser();
    }
}
