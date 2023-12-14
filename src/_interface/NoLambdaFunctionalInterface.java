package _interface;

import java.util.function.Predicate;

public class NoLambdaFunctionalInterface {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("M");
            }
        };

        System.out.println(predicate.test("Maaike"));
        System.out.println(predicate.test("Laila"));
    }
}
