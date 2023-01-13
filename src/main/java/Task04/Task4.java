package Task04;

public class Task4 {
    public Task4 () {
        System.out.println("Привет");
    }
    public Task4 (String name) {
        this();
        System.out.println(name);
    }
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        Task4 task41 = new Task4();
        Task4 task42 = new Task4("Tom");

    }
}
