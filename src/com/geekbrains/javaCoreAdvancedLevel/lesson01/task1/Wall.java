package com.geekbrains.javaCoreAdvancedLevel.lesson01.task1;

public class Wall implements SportsObstacle {

    private int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }

    public void overcomeMe(Recruit recruit){
        recruit.jump(this);
    }
}
