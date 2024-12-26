package com.company;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Opdracht 2.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input vuurpijlen: ");
        int vuurpijlen = scanner.nextInt();
        String nognx = "";
        scanner.nextLine();

        if (vuurpijlen < 5) {
            System.out.println("Lekker bescheiden");
        }

        else if (vuurpijlen > 20) {
            System.out.println("Dat is vast een prachtige show geweest");

        }
        else if (vuurpijlen >= 5 || vuurpijlen <= 20) {
            System.out.print("Input volgend jaar nogmaals: ");
            nognx = scanner.nextLine();
            if (nognx.equals("ja")) {
                System.out.println("Leuk, dan kom ik op bezoek");
            } else {
                System.out.println("Ohh wat jammer.");
            }
        }
    }
}