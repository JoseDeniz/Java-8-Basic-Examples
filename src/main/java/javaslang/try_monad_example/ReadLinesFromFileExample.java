package javaslang.try_monad_example;

import javaslang.control.Try;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class ReadLinesFromFileExample {

    public static void main(String[] args) {

        System.out.println("Lines before Upper Case:\n");

        readLines()
                .andThen(Console::printLines);


        System.out.println("\nLines after Upper Case:\n");

        readLines()
                .map(Parser::parseLinesToUpperCase)
                .andThen(Console::printLines);

    }

    private static Try<Stream<String>> readLines() {
        final Path path = Paths.get("src/main/resources/Hello.txt");
        return Try.of(() -> lines(path));
    }

}
