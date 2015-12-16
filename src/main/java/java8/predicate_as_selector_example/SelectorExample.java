package java8.predicate_as_selector_example;

import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class SelectorExample {

    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isOdd = number -> number % 2 != 0;
        Predicate<Integer> noFilters = number -> true;
        Predicate<Integer> isGreaterThanThree = number -> number > 3;
        Predicate<Integer> isLowerThanSeven = number -> number < 7;

        System.out.println("Sum of all numbers: " +       sum(numbers).filteringBy(noFilters) + "\n" +
                           "Sum of only even numbers: " + sum(numbers).filteringBy(isEven) + "\n" +
                           "Sum of only odd numbers: " +  sum(numbers).filteringBy(isOdd)+ "\n" +
                           "Sum of numbers greater than three and lower than seven: " +
                            sum(numbers).filteringBy(isGreaterThanThree.and(isLowerThanSeven)));
    }

    private static Filter sum(List<Integer> numbers) {
        return selector -> numbers.stream()
                                  .filter(selector)
                                  .reduce(Integer::sum)
                                  .get();
    }

}
