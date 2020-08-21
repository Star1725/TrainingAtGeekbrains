package com.geekbrains.javaCoreAdvancedLevel.lesson_01;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.*;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.SportsObstacle;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2_3_4.Wall;

public class Main {

    public static void main(String[] args) {

        System.out.println("----Task1----");

        MaterialObject[] myObjects = {new Human("Fry", 3, 1000),
                new Robot("Bender", 5, 1500),
                new Cat("Cat", 2, 80)};


        for (MaterialObject myObject : myObjects) {
            myObject.run();
            myObject.jump();
        }
        System.out.println();

        System.out.println("----Task2----");
        RunningTrack runningTrack = new RunningTrack(100);
        Wall wall = new Wall(2);

        for (MaterialObject myObject : myObjects) {
            runningTrack.getMaterialObjectForRun(myObject);
            wall.getMaterialObjectForJump(myObject);
        }
        //возвращаем всех выбывших
        for (MaterialObject materialObject : myObjects) {
            materialObject.setFlagLoser(false);
        }
        System.out.println();

        System.out.println("----Task3 + Task4----");
        SportsObstacle[] myObstacles = {new Wall(1),
                new RunningTrack(200),
                new Wall(4),
                new RunningTrack(2000)};

        for (SportsObstacle myObstacle : myObstacles) {
            for (MaterialObject myObject : myObjects) {
                myObstacle.getMaterialObjectForRun(myObject);
                myObstacle.getMaterialObjectForJump(myObject);
            }
            System.out.println();
        }
    }
}

