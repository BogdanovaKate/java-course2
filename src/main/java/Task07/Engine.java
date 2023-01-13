package Task07;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    void start() {
        System.out.println("Engine is starting");
    }

    void stop() {
        System.out.println("Engine is stopping");
    }

    String Engine = "Engine{" + "power=" + power + " company='" + company + '\'' + '}';

    @Override
    public String toString() {
        return "Engine{" + "power=" + power + " company='" + company + '\'' + '}';
    }

}

