package com.company;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("Opdracht 3.");
        Scanner scanner = new Scanner(System.in);

        int hypotheek = 0;
        int aflossing = 0;
        int totaal = 0;
        int afgelost = 0;

        System.out.print("Input: ");
        hypotheek = scanner.nextInt();

        for (int i = 1; hypotheek > 0; i++) {
            System.out.print("Input: ");
            aflossing = scanner.nextInt();
            hypotheek -= aflossing;
            totaal += aflossing;

            if (hypotheek <= 0) {
                int geldOver =  aflossing - hypotheek;
                System.out.println("Je had " + i + " betalingen nodig om de hypotheek af te lossen. Je krijgt " + totaal + " euro terug van de bank.");  //i = aantal betalingen
            }
        }
    }
}
