package functional_programming.functional_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 argument and produces 1 argument
        int increment = incrementByOne(1);
        System.out.println(increment);
        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply = multipleBy10Function.apply(2);
        System.out.println(multiply);
        System.out.println(
                incrementByOneFunction.andThen(multipleBy10Function).apply(4)
        );

        // BiFunction takes 2 argument and produces 1 argument
        System.out.println(
                incrementByOneAndMultiply(4, 100)
        ); // normal java function

        System.out.println(
                incrementByOneAndMultiplyBiFunction.apply(4, 100)
        ); // BiFunction
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numberToMultiplyBy) {
        return (number + 1) * numberToMultiplyBy;
    }


}
