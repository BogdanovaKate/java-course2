package Task07;

public class Main7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Driver driver = new Driver("John", 30, 10);
        Engine engine = new Engine(300, "BMW");
        Car car = new Car("X1", 2000, driver, engine);
        Car car1 = new Car("X1", 2000, driver, engine);
        Car sportcar = new SportCar("ferrari", 1500, driver, engine, 400);
        System.out.println(car.toString());
        System.out.println(sportcar.toString());
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        Car cloned = (Car) car.clone();
        System.out.println("Car=" + car);
        System.out.println("cloned=" + cloned);
        System.out.println(car.equals(car1));
        System.out.println((car == car1));
    }
}
