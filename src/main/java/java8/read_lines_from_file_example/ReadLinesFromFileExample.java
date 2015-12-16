package java8.read_lines_from_file_example;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class ReadLinesFromFileExample {

    public static void main(String[] args) {

        Path path = Paths.get("src/main/resources/Hello.txt");

        try {

            System.out.println("Lines before Upper Case:\n");
            printLines(lines(path));

            System.out.println("\nLines after Upper Case:\n");
            printLines(parseLinesToUpperCase(lines(path)));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Stream<String> parseLinesToUpperCase(Stream<String> lines) {
        return lines.map(String::toUpperCase);
    }

    private static void printLines(Stream<String> lines) throws IOException {
        lines.forEach(System.out::println);
    }

}
