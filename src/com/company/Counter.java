package com.company;

public class Counter {

    int counter = 0;

    public int countZeros(int[][] sudoku) {
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                if (sudoku[x][y] == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}