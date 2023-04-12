package Task12;

public class Main {
    public static void main(String[] args) {
        Operationable sum = (argument1, argument2) -> argument1+argument2;
        Operationable subtraction = (argument1, argument2) -> argument1-argument2;
        Operationable increase = (argument1, argument2) -> argument1*argument2;
        Operationable division = (argument1, argument2) -> argument1/argument2;
        System.out.println(sum.calculate(10,20));
        System.out.println(subtraction.calculate(10,20));
        System.out.println(increase.calculate(10,20));
        System.out.println(division.calculate(20,10));
    }
}
