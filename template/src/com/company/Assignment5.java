package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static java.time.chrono.JapaneseEra.values;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Opdracht 5.");

        ArrayList<Boolean> values = new ArrayList<>(Arrays.asList(true, false, true, true, false));
//        ArrayList<Boolean> values = new ArrayList<>(Arrays.asList(true, true, true, true));
//        ArrayList<Boolean> values = new ArrayList<>(Arrays.asList(false, false, false, false, false));


        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals(true)) {
                values.set(i, false);
            } else if (values.get(i).equals(false)) {
                values.set(i, true);
            }
        }

        if (values.contains(true)) {
            for (int i = 0; i < values.size(); i++) {
                System.out.println(values.get(i));
            }
        } else {
            System.out.println("Helaas pindakaas");
        }
    }
}