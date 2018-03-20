package coms.jsen.test.guava;

import com.google.common.base.Optional;

public class SimpleGuava {

    public static void main(String[] args) {
        Optional<Integer> opt = Optional.of(0);
        System.out.println(opt.isPresent());
        System.out.println(opt.or(10));
        System.out.println(opt.orNull());
        System.out.println(opt.asSet().size());
    }
}
