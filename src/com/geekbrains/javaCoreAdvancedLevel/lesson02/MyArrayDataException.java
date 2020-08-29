package com.geekbrains.javaCoreAdvancedLevel.lesson02;

public class MyArrayDataException extends NumberFormatException{

    private int numStroke;
    private int numColumn;

    public MyArrayDataException(int numStroke, int numColumn){
        this.numStroke = numStroke;
        this.numColumn = numColumn;
    }

    public MyArrayDataException(String message, int numStroke, int numColumn) {
        super(message);
        this.numStroke = numStroke;
        this.numColumn = numColumn;
    }
}
