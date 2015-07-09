package grouping_example;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
