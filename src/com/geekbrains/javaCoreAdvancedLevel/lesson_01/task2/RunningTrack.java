package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2;

public class RunningTrack implements HavingSportParam{
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public int getParam() {
        return this.length;
    }
}
