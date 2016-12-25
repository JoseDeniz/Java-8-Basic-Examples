package javaslang.pattern_matching;

import javaslang.collection.List;

import java.util.function.Predicate;

import static javaslang.API.*;

public class PatternMatching {

    public static void main(String[] args) {
        String fizzBuzz = List.rangeClosed(1, 100)
                .map(PatternMatching::parseNumber)
                .reduce((acc, nextValue) -> acc += ", " + nextValue);

        System.out.println(fizzBuzz);
    }

    private static String parseNumber(Integer number) {
        final Predicate<Integer> isMultipleOfThree = n -> n % 3 == 0;
        final Predicate<Integer> isMultipleOfFive = n -> n % 5 == 0;
        final Predicate<Integer> isMultipleOfFifteen = isMultipleOfThree.and(isMultipleOfFive);
        return Match(number).of(
                Case(isMultipleOfFifteen, "FizzBuzz"),
                Case(isMultipleOfThree, "Fizz"),
                Case(isMultipleOfFive, "Buzz"),
                Case($(), String.valueOf(number))
        );
    }

}
