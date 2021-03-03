package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtiles;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {

        List<String> cursos = NombresUtiles.getList("Java", "Funtional");

        cursos.forEach(curso -> System.out.println(curso));

        usarZero(() -> 2); // lambda que no toma argumentos

        usarPredicado(text -> text.isEmpty()); // lo predicados obligatoriamente retornan un boolean

        usarBiFunction((x, y) -> x * y);

        // con los tipos, solo objetos, no primitivos
        usarBiFunction((Integer x, Integer y) -> x * y);

        usarBiFunction((x, y) -> {
            System.out.println("X. " + x + "Y: " + y);
            return x * y;
        });

        usarNada(() -> {
            System.out.println("Hola");
        });

    }

    static void usarZero(ZeroArguments arguments) {

    }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    static void usarPredicado(Predicate<String> predicate) {

    }

    static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion) {

    }

    @FunctionalInterface
    interface operarNada {
        void nada();
    }

    static void usarNada(operarNada operarNada) {

    }
}

