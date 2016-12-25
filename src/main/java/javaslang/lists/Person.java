package javaslang.lists;

public class Person {

    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public Integer age() {
        return age;
    }
}
