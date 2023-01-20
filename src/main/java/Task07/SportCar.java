package Task07;

public class SportCar extends Car {
    private final int speedLimit;

    public SportCar(String model, int weight, Driver driver, Engine engine,int speedLimit) {
        super(model, weight, driver, engine);
        this.speedLimit = speedLimit;
    }
    @Override
    public String toString() {
        return "SportCar{" + "model='" + model + '\'' + " weight=" + weight + ", " + driver + ", " + engine + ", " + "speedlimit= " + speedLimit + '}';
    }
}

