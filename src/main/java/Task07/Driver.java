package Task07;

public class Driver extends Person {
    private int experience;

    public Driver(String fullname, int age, int experience) {
        super(fullname, age);
        this.experience = experience;
    }

    String Driver = "Driver{" + "fullname='" + fullname + '\'' + " age=" + age + " experience=" + experience + '}';

    @Override
    public String toString() {
        return "Driver{" + "fullname='" + fullname + '\'' + " age=" + age + " experience=" + experience + '}';
    }
}
