package com.company;

public class SudokuLevel {
    int level = 0;
    public int sudokuLevelSetting(int numberOfZeros) {

        int number = 81 - numberOfZeros;
        if (number >= 35 && number < 60) {
            level = 1;
        }
        else if (number >= 29 && number < 34) {
            level = 2;
        }
        else if (number >= 26 && number < 28) {
            level = 3;
        }
        else if (number < 26) {
            level = 4;
        }

        return level;
    }
}
