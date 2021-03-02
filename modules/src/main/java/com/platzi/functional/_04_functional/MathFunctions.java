package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squardFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        Integer x = 5;
        System.out.println("El valor de " + x + " elevado al cuadrado es: " + squardFunction.apply(x));
        System.out.println("El valor de " + x * x + " elevado al cuadrado es: " + squardFunction.apply(squardFunction.apply(x)));


        Function<Integer, Boolean> isOdd = n -> n % 2 == 1;
        System.out.println("Es impar: " + isOdd.apply(5));

//        Interface Predicate: es una especie de funcion que trabaja sobre un tipo y genera un boolean

        Predicate<Integer> isEven = x1 -> x1 % 2 == 0;
        System.out.println("Es par: " + isEven.test(11));

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student hernan = new Student(5.9);
        System.out.println("Aprobó: " + isApproved.test(hernan));
    }

    static class Student {

        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
