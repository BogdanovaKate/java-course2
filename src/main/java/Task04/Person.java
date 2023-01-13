package Task04;

public class Person {
    String name;
    int age;

    void talk(String speech) {
        System.out.println(name + " says: " + speech);
    }

    void move(String destination) {
        System.out.println((name + " идет в " + destination));
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person tom = new Person("Tom", 30);
        Person john = new Person("John");
        tom.talk("Привет");
        john.talk("Пока");
        tom.move("Москву");
        john.move("Париж");
    }
}


