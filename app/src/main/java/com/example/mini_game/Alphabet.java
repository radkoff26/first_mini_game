package com.example.mini_game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabet {
    public static final String[] ALPHABET = "a b c d e f g h i j k l m n o p q r s t u v w x y z".toLowerCase().split(" ");
    public static char getRandomChar() {
        List<String> list = Arrays.asList(ALPHABET);
        int random = (int) (Math.random()*(list.size()));
        return list.get(random).trim().charAt(0);
    }
}
