package Task07;

public class Car {
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
