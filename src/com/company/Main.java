package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int choice;
        int numberOfZeros;
        int [][] sudoku = new int[9][9];
        Scanner scanner = new Scanner(System.in);
        FileScanner fileScanner = new FileScanner();
        Displayer displayer = new Displayer();
        Counter counter = new Counter();
        SudokuLevel sudokuLevel = new SudokuLevel();

        while (true) {
            System.out.println("\n \n Meniu pasirinkimai:");
            System.out.println("1. Įkelti naują sudokų schemą");
            System.out.println("2. Atvaizduoti naują, įkeltą sudokų schemą");
            System.out.println("3. Priskirti lygį sudoku schemai");
            System.out.println("4. Išeiti iš programos\n \n");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Scanner scannerForURL = new Scanner(System.in);
                    System.out.println("Įveskite naujai sukurtos sudoku schemos nuorodą:");
                    String URL = scannerForURL.nextLine();
                    sudoku = fileScanner.txtFileScanner(URL);
                    System.out.println("Nauja sudoku schema įkelta į programą! \n \n");
                    break;
                case 2:
                    System.out.println("Naujai įkelta sudoku schema: \n");
                    displayer.displaySudokuSchema(sudoku);
                    break;
                case 3:
                    numberOfZeros = counter.countZeros(sudoku);
                    System.out.println("Šios sudoku schemos lygis yra " + sudokuLevel.sudokuLevelSetting(numberOfZeros));
                    break;
                case 4:
                    System.out.println("Išjungiama...");
                    System.exit(0);
                default:
                    System.out.println("Blogas pasirinkimas! Įsitikinkite ar teisingai pasirinkote. \n \n");
            }
        }
    }
}
