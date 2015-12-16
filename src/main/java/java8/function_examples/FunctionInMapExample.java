package java8.function_examples;

import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class FunctionInMapExample {

    public static void main(String[] args) {

        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Function<Integer, Integer> square = number -> number * number;

        List<Integer> numbersSquared = numbers.stream()
                                              .map(square)
                                              .collect(toList());

        System.out.println("Original list: " + numbers + "\n" +
                           "Numbers squared: " + numbersSquared);
    }

}
