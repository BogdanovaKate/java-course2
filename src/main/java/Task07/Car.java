package Task07;

import java.util.Objects;

public class Car implements Cloneable {
    final String model;
    final int weight;
    final Driver driver;
    final Engine engine;

    public Car(String model, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return weight == car.weight && Objects.equals(model, car.model) && Objects.equals(driver, car.driver) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, driver, engine);
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + " weight=" + weight + ", " + driver + ", " + engine + '}';
    }

    public void start() {
        engine.start();
        System.out.println("Car is staring");
    }
    public void stop() {
        engine.stop();
        System.out.println("Car is stopping");
    }

    void turnLeft() {
        System.out.println("Going to the left");
    }

    void turnRight() {
        System.out.println("Going to the right");
    }
}
