package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

    public int[][] txtFileScanner (String URL) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(URL));

        int[][] sudoku = new int[9][9];

        String line = fileScanner.nextLine();

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                sudoku[x][y] = Character.getNumericValue(line.charAt(x));

                if (x == 8 && fileScanner.hasNextLine()) {
                    line = fileScanner.nextLine();
                }
            }
        }
        return sudoku;
    }
}
