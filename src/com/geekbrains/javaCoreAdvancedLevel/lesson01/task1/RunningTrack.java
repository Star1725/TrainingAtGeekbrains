package com.geekbrains.javaCoreAdvancedLevel.lesson01.task1;

public class RunningTrack implements SportsObstacle {

    private int length;

    public int getLength() {
        return length;
    }

    public RunningTrack(int length) {
        this.length = length;
    }

    public void overcomeMe(Recruit recruit){
        recruit.run(this);
    }
}
