package predicate_as_selector_example;

import java.util.function.Predicate;

@FunctionalInterface
public interface Filter {

    int filteringBy(Predicate<Integer> selector);

}
