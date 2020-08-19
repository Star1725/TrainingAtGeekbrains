package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

public class Human implements SuperAction{
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Human " + this.name + " jump");
    }

    @Override
    public void run() {
        System.out.println("Human " + this.name + " run");
    }
}
