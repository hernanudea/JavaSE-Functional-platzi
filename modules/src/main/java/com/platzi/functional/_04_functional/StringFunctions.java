package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        // Recibe un tipo y retorna el mismo tipo
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola programador"));
        System.out.println(addMark.apply("Soy programador"));

        // Recibe dos tipos de datos y retorna un tercer tipo de dato
        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;

        System.out.println("Multiplicación: " + multiplicacion.apply(4, 5));

        // todos los tipos son iguales, los dos de entrada y el de salida
        BinaryOperator<Integer> multiplicacion2 = (x, y) -> x * y;
        System.out.println("Multiplicación2: " + multiplicacion2.apply(4, 5));

        //agregar esacio a un string
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
        System.out.println("Cadena con espacios:" + leftPad.apply("Hola Mundo", 20));


    }

}
