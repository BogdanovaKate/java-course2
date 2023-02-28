package Task09;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPrinter<T> {
    @Override
    public String toString() {
        return stringListPrinter.toString();
    }

    private ArrayList<T> stringListPrinter;

    public ListPrinter() {
        this.stringListPrinter = new ArrayList<>();
    }

    public void add(T element) {
        stringListPrinter.add(element);
    }

    public void printList(boolean isOdd) {
        for (int i = 0; i < stringListPrinter.size(); i++) {
            if (i % 2 == 0 && !isOdd) {
                System.out.println(stringListPrinter.get(i));
            } else if (i % 2 != 0 && isOdd) {
                System.out.println(stringListPrinter.get(i));

            }
        }
    }


    public static void main(String[] args) {
        ListPrinter<String> stringListPrinter = new ListPrinter<>();
        stringListPrinter.add("11");
        stringListPrinter.add("12");
        stringListPrinter.add("13");
        stringListPrinter.add("14");
        stringListPrinter.add("15");
        System.out.println(stringListPrinter);
        //stringListPrinter.printList(true);
        stringListPrinter.printList(false);
    }
}
