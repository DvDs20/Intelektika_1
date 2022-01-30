package com.company;

public class Displayer {

    public void displaySudokuSchema(int[][] sudoku) {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                System.out.print(sudoku[x][y]);
                if (x == 8) {
                    System.out.println();
                }
            }
        }
    }
}
