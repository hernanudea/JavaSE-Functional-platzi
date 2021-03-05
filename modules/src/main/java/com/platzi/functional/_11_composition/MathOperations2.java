package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {

        Function<Integer, Integer> multiplyBy3 = x -> x * 3;

        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregaré 1 a: " + y);
                    return y + 1;
                });

        Function<Integer, Integer> andSquard =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(add1MultiplyBy3.apply(5));
        System.out.println(andSquard.apply(3));

    }
}
