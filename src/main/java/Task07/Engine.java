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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + power + " company='" + company + '\'' + '}';
    }

}

