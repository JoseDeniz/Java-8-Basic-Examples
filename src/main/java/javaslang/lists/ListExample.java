package javaslang.lists;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {

        final Person[] personArray = new Person[]{new Person("Stacey", 12),
                                                  new Person("Matt", 13),
                                                  new Person("Denise", 14)};

        final Predicate<Person> isOlderThanTwelve = person -> person.age() > 12;

        // Java 8
        List<Person> people1 = Arrays.asList(personArray);
        List<String> names1 = people1
                .stream()
                .filter(isOlderThanTwelve)
                .map(Person::name)
                .collect(Collectors.toList());

        // Javaslang
        javaslang.collection.List<Person> people2 = javaslang.collection.List.of(personArray);

        javaslang.collection.List<String> names2 = people2
                .filter(isOlderThanTwelve)
                .map(Person::name)
                /*.toJavaList() if we want to use the java.util.List*/;

        System.out.printf("%s \n %s", names1, names2);
    }
}
