package java8.collectors_examples.grouping_example;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;

public class GroupingExample {

    public static void main(String[] args) {

        List<Person> people = asList(new Person("Max", 29),
                                     new Person("Mary", 30),
                                     new Person("Alan", 28),
                                     new Person("Alice", 28),
                                     new Person("Steve", 30));

        System.out.println(groupPeopleByAge(people));
    }

    private static Map<Integer, List<Person>> groupPeopleByAge(List<Person> people) {
        return people.stream().collect(groupingBy(Person::age));
    }

}
