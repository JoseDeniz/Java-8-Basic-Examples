package SupplierExample;

import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * This example shows the use of a Supplier for an IntStream
 * because you can not reuse a stream once it is consumed.
 */
public class IntStreamSupplierExample {

    public static void main(String[] args) {

        Supplier<IntStream> numbersFromZeroToTenStreamSupplier = () -> IntStream.rangeClosed(0, 10);

        IntFunction<Integer> doubleIt = number -> number * 2;
        IntFunction<Integer> squareIt = number -> number * number;

        List<Integer> doubledNumbers = numbersFromZeroToTenStreamSupplier.get()
                                                                         .mapToObj(doubleIt)
                                                                         .collect(toList());

        System.out.println("Doubled numbers: " + doubledNumbers);

        List<Integer> squaredNumbers = numbersFromZeroToTenStreamSupplier.get()
                                                                         .mapToObj(squareIt)
                                                                         .collect(toList());

        System.out.println("Squared numbers: " + squaredNumbers);

    }

}
