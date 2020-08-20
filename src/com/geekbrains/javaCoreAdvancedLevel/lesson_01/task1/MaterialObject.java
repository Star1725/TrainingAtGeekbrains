package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.Wall;

public class MaterialObject implements Running, Jumping{
    private String name;
    private int maxJump;
    private int maxDist;
    private boolean flagLoser;

    public void setFlagLoser(boolean flagLoser) {
        this.flagLoser = flagLoser;
    }

    public MaterialObject(String name, int maxJump, int maxDist) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxDist = maxDist;
    }

    @Override
    public void jump(Wall wall) {
        if (flagLoser) System.out.print("");
        else if (wall.getHeight() > this.maxJump) {
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " did not jumped over wall " + wall.getHeight() + " meters high and got off");
            flagLoser = true;
        }
        else System.out.println(this.getClass().getSimpleName() + " " + this.name + " jumped over wall " + wall.getHeight() + " meters high");
    }

    @Override
    public void run(RunningTrack track) {
        if (flagLoser) System.out.print("");
        else if (track.getLength() > this.maxDist) {
            System.out.println(this.getClass().getSimpleName() + " " + this.name + " did not ran a distance of " + track.getLength() + " meters and got off");
            flagLoser = true;
        }
        else System.out.println(this.getClass().getSimpleName() + " " + this.name + " ran a distance of " + track.getLength() + " meters");
    }

    @Override
    public void jump() {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " jump");
    }

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName() + " " + this.name + " run");
    }
}
