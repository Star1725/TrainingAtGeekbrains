package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.MaterialObject;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.Running;

public class RunningTrack extends SportsObstacle{
    private int length;

    public int getLength() {
        return length;
    }

    public RunningTrack(int length) {
        this.length = length;
    }

    public void getMaterialObjectForRun(Running object){
        object.run(this);
    }
}
