package javaslang.tuples;

import javaslang.Tuple;
import javaslang.Tuple2;

public class TupleExample {

    public static void main(String[] args) {

        Tuple2<String, Integer> cell = Tuple.of("A", 1);

        String key = cell._1;
        Integer value = cell._2;

        System.out.printf("Key: %s   Value: %d\n", key, value);

        // We can map a tuple
        Tuple2<String, Integer> mapped1 = cell.map(
                k -> k + "B",
                v -> v + 1
        );

        // Or using one mapper
        Tuple2<String, Integer> mapped2 = cell.map((k, v) -> Tuple.of(k + "B", v + 1));

        System.out.printf("Mapped1: %s\nMapped2: %s\n", mapped1, mapped2);

        // Also, we can transform a tuple
        String transform = cell.transform((k, v) -> String.format("(%s,%d)", k, v));

        System.out.printf("Transformed: %s", transform);
    }

}
