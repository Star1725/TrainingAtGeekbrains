package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

public class Cat implements SuperAction{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " jump");
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " run");
    }
}
