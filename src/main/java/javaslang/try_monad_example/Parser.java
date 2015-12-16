package javaslang.try_monad_example;

import java.util.stream.Stream;

public class Parser {

    public static Stream<String> parseLinesToUpperCase(Stream<String> lines) {
        return lines.map(String::toUpperCase);
    }

}
