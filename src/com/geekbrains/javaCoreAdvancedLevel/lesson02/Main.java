package com.geekbrains.javaCoreAdvancedLevel.lesson02;

public class Main {
    public static void main(String[] args) {
        String[][] myArray = {
                {"1", "2", "3", "4"},
                {"5", "Kill", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
                //{"13", "14", "15", "16", "17"}
        };
        System.out.println("Проверка и расчёт суммы массива 4*4:");
        try {
            System.out.println("Сумма элементов массива = " + methodForCheckingArray(myArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int methodForCheckingArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        if (myArray.length != 4) {
            throw new MyArraySizeException("MyArraySizeException! В массиве не 4 строки");
        }

        int sum = 0;
        int numStroke = 0;
        int numColumn = 0;

        for (String[] ints : myArray) {
            numStroke +=  1;
            numColumn = 0;
            for (String anCount : ints) {
                if (ints.length != 4){
                    throw new MyArraySizeException("MyArraySizeException! В одной из строк массива не 4 элемента");
                }
                numColumn += 1;

                try {
                    sum += Integer.parseInt(anCount);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("MyArrayDataException! Элемент массива в строке " + numStroke
                            + " столбца " + numColumn + " не является числом", numStroke, numColumn);
                }
            }
        }
        return sum;
    }
}
