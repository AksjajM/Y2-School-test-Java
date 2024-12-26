package com.company;

import java.util.Scanner;

//22161244 Aksjaj Mehilal
public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Opdracht 1.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input voornaam: ");
        String voornaam = scanner.nextLine();
        System.out.print("Input Patientnumer: ");
        int patientnummer = scanner.nextInt();
        System.out.printf("%d - %s heeft op 04-05-2023 zijn medicijnen opgehaald.", patientnummer, voornaam);
    }
}
