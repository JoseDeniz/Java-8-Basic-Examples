package javaslang.try_monad_example;

import java.util.stream.Stream;

public class Console {

    public static void printLines(Stream<String> lines) {
        lines.forEach(System.out::println);
    }

}
