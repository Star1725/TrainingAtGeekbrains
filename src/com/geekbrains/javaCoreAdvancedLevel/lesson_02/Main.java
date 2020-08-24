package com.geekbrains.javaCoreAdvancedLevel.lesson_02;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {13, 14, 15, 16}
        };

        try {
            methodForCheckingArray(myArray);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    private static void methodForCheckingArray(int[][] myArray) throws MyArraySizeException {
        if (myArray.length != 4) {
            throw new MyArraySizeException();
        }
    }


}
