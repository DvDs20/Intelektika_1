package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Meniu pasirinkimai:");
            System.out.println("1. Įkelti naują sudokų schemą");
            System.out.println("2. Atvaizduoti naują, įkeltą sudokų schemą");
            System.out.println("3. Priskirti lygį sudoku schemai");
            System.out.println("4. Išeiti iš programos\n \n");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("pirmas");
                    break;
                case 2:
                    System.out.println("antras");
                    break;
                case 3:
                    System.out.println("trečias");
                    break;
                case 4:
                    System.out.println("Išjungiama...4");
                    System.exit(0);
                default:
                    System.out.println("Blogas pasirinkimas! Įsitikinkite ar teisingai pasirinkote. \n \n");
            }
        }
    }
}
