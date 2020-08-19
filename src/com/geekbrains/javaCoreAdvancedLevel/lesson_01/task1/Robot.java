package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

public class Robot implements SuperAction{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " jump");
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " run");
    }
}
