package TaskMoney;

public class Money {
    public int rub;
    public int penny;

    public Money(int rub, int penny) {
        this.rub = rub;
        this.penny = penny;
    }

    public Money multiply(int multiplier) {
        int a = rub * multiplier;
        int b = penny * multiplier;
        int z = b % 100;
        if (b >= 100) {
            a = a + (b - z) / 100;
            b = z;
        }
        return new Money(a, b);
    }

    public Money plus(Money other) {
        int a = rub + other.rub;
        int b = penny + other.penny;
        if (b >= 100) {
            a++;
            b = b % 100;
        }
        return new Money(a, b);
    }

    public Money minus(Money other) {
        int a = rub - other.rub;
        int b = penny - other.penny;
        int z = 100 + b;
        if (b < 0 && a > 0) {
            a--;
            b = z;
        }
        return new Money(a, b);
    }

    public void print() {
        System.out.println("rub=" + rub + "," + "penny=" + penny);
    }
}
