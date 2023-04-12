package Task12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Processor {
    public static void processInts(
            Collection<Integer> ints,
            Predicate<Integer> filter,
            Function<Integer, Integer> mapper,
            Consumer<Integer> consumer
    ) {
        for (Integer i : ints) {
            if (filter.test(i)) {
                Integer mapped = mapper.apply(i);
                consumer.accept(mapped);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(new Integer(1));
        ints.add(new Integer(2));
        ints.add(new Integer(3));
        ints.add(new Integer(4));
        processInts(
                ints,
                integer -> (integer.intValue()%2) == 0,
                integer -> integer.intValue()*2,
                integer -> System.out.println("i:" + integer.intValue())
        );
    }

}
