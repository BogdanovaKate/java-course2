package Task07;

public class Driver extends Person {
    private final int experience;

    public Driver(String fullname, int age, int experience) {
        super(fullname, age);
        this.experience = experience;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Driver{" + "fullname='" + fullname + '\'' + " age=" + age + " experience=" + experience + '}';
    }
}
