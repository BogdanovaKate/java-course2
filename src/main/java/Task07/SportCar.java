package Task07;

public class SportCar extends Car {
    private int speedlimit;

    public SportCar(String model, int weight, Driver driver, Engine engine,int speedlimit) {
        super(model, weight, driver, engine);
        this.speedlimit = speedlimit;
    }
    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + " weight=" + weight + ", " + driver + ", " + engine + ", " + "speedlimit= " + speedlimit + '}';
    }
}

