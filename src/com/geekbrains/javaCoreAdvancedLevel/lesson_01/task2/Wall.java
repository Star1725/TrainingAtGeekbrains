package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2;

public class Wall implements HavingSportParam{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getParam() {
        return this.height;
    }
}
