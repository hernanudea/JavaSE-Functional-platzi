package com.platzi.functional._14_optionals;

import java.util.*;

public class MyOptionals {
    public static void main(String[] args) {
        List<String> names = getNames();
        if (getNames() != null) {
            // Operar con nombres
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()) {
            // ...
        }

        optionalNames.isPresent(namesValue -> namesValue.forEach(System.out::println));
//        optionalNames.map()

        Optional<String> valuablePlayer = optionalValueblePlayer();

        // valor por defecto
        String valuablePlayerName = valuablePlayer.orElseGet(() -> "no player");


    }

    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        // ...
        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
//        return "";
        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    static Optional<List<String>> getOptionalNames() {
        List<String> namesList = new LinkedList<String>();
        // obtención de nombres
        return Optional.of(namesList);
    }

    static Optional<String> optionalValueblePlayer() {

        // si no sabemos si es null o no
//        return Optional.ofNullable();
        try {
            // accesos
            return Optional.of("text");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // si no encontramos nada
        return Optional.empty();
    }

}
