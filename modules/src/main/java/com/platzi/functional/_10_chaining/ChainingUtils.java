package com.platzi.functional._10_chaining;

public class ChainingUtils {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola ")
                .append("mundo ")
                .append("inmundo")
                .append("!");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer2.sayBye();
    }

    static class Chainer {

        public Chainer sayHi() {
            System.out.println("Hello");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
