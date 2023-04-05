package Task10;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Box> set = new TreeSet<>(new BoxBiggerSizeComparator());
        set.add(new Box(10));
        set.add(new Box(100));
        set.add(new Box(40));

        System.out.println(set);
    }
}
