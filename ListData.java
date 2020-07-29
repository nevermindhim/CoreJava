package com.test;

import java.util.*;

public class ListData {
    public static void main(String[] args) {
        List<Character> L1 = new ArrayList<>();
        L1.add('G');
        L1.add('a');
        L1.add('n');
        L1.add('d');
        L1.add('h');
        L1.add('i');
        int[] asciiValue = new int[L1.size()];
        System.out.println(L1);
        int i = 0;
        for (i = 0; i < L1.size(); i++) {
            asciiValue[i] = (int) L1.get(i);
        }
        System.out.println(Arrays.toString(asciiValue));
        for (i = 0; i < asciiValue.length; i++) {
            for (int j = i + 1; j < asciiValue.length; j++) {
                if (asciiValue[i] > asciiValue[j]) {
                    int temp = asciiValue[i];
                    asciiValue[i] = asciiValue[j];
                    asciiValue[j] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(asciiValue));
        for (i = 0; i < asciiValue.length; i++) {
            System.out.println(Character.toString((char) asciiValue[i]) + " " + asciiValue[i]);
        }
    }
}
