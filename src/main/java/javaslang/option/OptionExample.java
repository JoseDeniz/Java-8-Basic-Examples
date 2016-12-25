package javaslang.option;

import javaslang.control.Option;

public class OptionExample {

    public static void main(String[] args) {

        Option<String> some = Option.of("foo");
        Option<String> none = Option.of(null);

        System.out.println(some);
        System.out.println(none);
    }
}
