package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.HavingSportParam;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.Wall;

public class Cat implements SuperAction{
    private String name;
    private int maxJump;
    private int maxDist;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int maxJump, int maxDist) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxDist = maxDist;
    }

    @Override
    public boolean jump(HavingSportParam wall) {
        if (wall instanceof  Wall){
            System.out.println("Cat " + this.name + (wall.getParam() > this.maxJump? " did not jumped over wall " : " jumped over wall ") + wall.getParam() + " meters high");
            return wall.getParam() > this.maxJump;
        }
        return false;
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " jump");
    }

    @Override
    public boolean run(HavingSportParam track) {
        if (track instanceof RunningTrack){
            System.out.println("Cat " + this.name + (track.getParam() > this.maxDist ? " did not ran a distance of " : " ran a distance of ") + track.getParam() + " meters");
            return track.getParam() > this.maxDist;
        }
        return false;
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " run");
    }
}
