package src.Entity;

public class Car {
    public int id;
    public String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Car cloneCar() {
        return new Car(id, name);
    }
}
