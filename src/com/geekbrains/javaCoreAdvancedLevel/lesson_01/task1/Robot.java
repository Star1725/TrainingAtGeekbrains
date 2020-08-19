package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.HavingSportParam;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.Wall;

public class Robot implements SuperAction{
    private String name;
    private int maxJump;
    private int maxDist;

    public Robot(String name) {
        this.name = name;
    }

    public Robot(String name, int maxJump, int maxDist) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxDist = maxDist;
    }

    @Override
    public void jump(HavingSportParam wall) {
        System.out.println("Robot " + this.name + (wall.getParam() > this.maxJump? " did not jumped over wall " : " jumped over wall ") + wall.getParam() + " meters high");
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " jump");
    }

    @Override
    public void run(HavingSportParam track) {
        System.out.println("Robot " + this.name + (track.getParam() > this.maxDist ? " did not ran a distance of " : " ran a distance of ") + track.getParam() + " meters");
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " run");
    }
}
