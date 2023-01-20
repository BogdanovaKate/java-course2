package TaskMoney;

public class Main3 {
    public static void main(String[] args) {
        Money m1 = new Money (10,30);
        Money m2 = new Money (3,90);
        Money m3 = m1.plus(m2);
        m3.print();
        Money m4 = m1.minus(m2);
        m4.print();
        Money m5 = new Money(2,80);
        Money m6 = m5.multiply(27);
        m6.print();
    }
}
