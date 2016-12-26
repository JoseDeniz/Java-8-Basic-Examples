package javaslang.pattern_matching;

import javaslang.collection.List;

import java.util.function.Predicate;

import static javaslang.API.*;

public class FizzBuzzPatternMatching {

    public static void main(String[] args) {
        String fizzBuzz = List.rangeClosed(1, 100)
                .map(FizzBuzzPatternMatching::parseNumber)
                .reduce((acc, nextValue) -> acc += ", " + nextValue);

        System.out.println(fizzBuzz);
    }

    private static String parseNumber(Integer number) {
        final Predicate<Integer> isDivisibleByThree = n -> n % 3 == 0;
        final Predicate<Integer> isDivisibleByFive = n -> n % 5 == 0;
        final Predicate<Integer> isDivisibleByThreeAndFive = isDivisibleByThree.and(isDivisibleByFive);
        return Match(number).of(
                Case(isDivisibleByThreeAndFive, "FizzBuzz"),
                Case(isDivisibleByThree, "Fizz"),
                Case(isDivisibleByFive, "Buzz"),
                Case($(), String.valueOf(number))
        );
    }

}
