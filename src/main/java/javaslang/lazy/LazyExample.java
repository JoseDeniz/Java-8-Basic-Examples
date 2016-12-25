package javaslang.lazy;

import javaslang.Lazy;

public class LazyExample {

    public static void main(String[] args) {

        Lazy<Double> lazy = Lazy.of(Math::random);

        lazy.isEvaluated();    // = false
        lazy.get();            // random value generated
        lazy.isEvaluated();    // = true
        lazy.get();            // = memoized value

    }


}
