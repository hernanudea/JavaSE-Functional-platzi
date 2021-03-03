package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtiles;

import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        Function<Integer, String> funcionCOnvertidora =
                integer -> "Al doble " + (integer * 2);

        List<String> alumnos = NombresUtiles.getList("Hugo", "Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
