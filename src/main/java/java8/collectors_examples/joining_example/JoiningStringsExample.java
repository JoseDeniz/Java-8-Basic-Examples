package java8.collectors_examples.joining_example;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class JoiningStringsExample {

    public static void main(String[] args) {

        List<String> months = Arrays.asList("January", "February", "March",
                                            "April", "May", "June",
                                            "July", "August", "September",
                                            "October", "November", "December");

        System.out.println(months.stream().collect(joining(", ")));

    }

}
