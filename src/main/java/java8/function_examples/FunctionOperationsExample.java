package java8.function_examples;

import java.util.function.Function;

public class FunctionOperationsExample {

    public static void main(String[] args) {

        Function<Integer, Integer> plusTwo = number -> number + 2;
        Function<Integer, Integer> doubleIt = number -> number * 2;

        int result = plusTwo.andThen(doubleIt).apply(3);

        System.out.println("The double of three is: " + doubleIt.apply(3) + "\n" +
                           "The result of plus two to three and then doubled it is: " + result);
    }

}
