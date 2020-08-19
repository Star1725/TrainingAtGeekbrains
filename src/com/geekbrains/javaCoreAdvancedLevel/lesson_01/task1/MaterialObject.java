package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.HavingSportParam;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.Wall;

public class MaterialObject implements SuperAction{
    private String name;
    private int maxJump;
    private int maxDist;

    public MaterialObject(String name, int maxJump, int maxDist) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxDist = maxDist;
    }

    @Override
    public boolean jump(HavingSportParam wall) {
        if (wall instanceof Wall){
            System.out.println(this.getClass().getSimpleName() + " " + this.name + (wall.getParam() > this.maxJump? " did not jumped over wall " : " jumped over wall ") + wall.getParam() + " meters high");
            return wall.getParam() > this.maxJump;}
        return false;
    }

    @Override
    public boolean run(HavingSportParam track) {
        if (track instanceof RunningTrack){
            System.out.println(this.getClass().getSimpleName() + " " + this.name + (track.getParam() > this.maxDist ? " did not ran a distance of " : " ran a distance of ") + track.getParam() + " meters");
            return track.getParam() > this.maxDist;}
        return false;
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