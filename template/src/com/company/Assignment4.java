package com.company;

public class Assignment4 {
    public static String printVoldoende(double[] values) {
        int voldoendes = 0;
        int aantalCijfers = values.length;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 5.4) {
                System.out.println(values[i]);
                voldoendes++;
            }
        }
        return "Er waren totaal " + aantalCijfers + " cijfers en " + voldoendes + " daarvan waren voldoende.";
    }

    public static void main(String[] args) {
        System.out.println("Opdracht 4.");
//        double[] values = {1.0, 5.4, 5.6, 10.0};
        double[] values = {9.0, 7.5, 5.6, 10.0};
//        double[] values = {1.0, 2.5, 5.4, 1.0};
        System.out.println(printVoldoende(values));
    }
}
