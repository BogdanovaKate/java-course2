package Task10;

import javax.swing.*;
import java.util.*;

public class Main {

    public static Collection<Box> filterBySize(Collection<Box> collection, int size) {
        ArrayList<Box> list = new ArrayList();
        for (Box element : collection) {
            if (element.getSize() < size) {
                list.add(element);
            }
        }
        return list;
    }

    public static Collection<Box> filterBySize(Iterator<Box> iterator, int size) {
        ArrayList<Box> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Box element = iterator.next();
            if (element.getSize() < size) {
                list.add(element);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        LinkedList<Box> list = new LinkedList<>();
        list.add(new Box(10));
        list.add(new Box(15));
        list.add(new Box(20));
        list.add(new Box(30));
        System.out.println(list);
        Collection<Box> result = filterBySize(list, 20);
        Collection<Box> result2 = filterBySize(list.iterator(), 20);
        System.out.println(result);
        System.out.println(result2);
/*
        PriorityQueue<Box> boxes = new PriorityQueue<>();
        boxes.add(new Box(10));
        boxes.add(new Box(90));
        boxes.add(new Box(40));
        boxes.add(new Box(30));
        boxes.add(new Box(60));

        while (!boxes.isEmpty()) {
            System.out.println(boxes.poll());
        }
*/
        PriorityQueue<Box> boxes = new PriorityQueue<>(new BoxBiggerSizeComparator());
        boxes.add(new Box(10));
        boxes.add(new Box(90));
        boxes.add(new Box(40));
        boxes.add(new Box(30));
        boxes.add(new Box(60));

        while (!boxes.isEmpty()) {
            System.out.println(boxes.poll());
        }
    }
}

