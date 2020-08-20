package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.Jumping;

public class Wall extends SportsObstacle{
    private int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }

    public void getMaterialObjectForJump(Jumping object){
        object.jump(this);
    }
}
