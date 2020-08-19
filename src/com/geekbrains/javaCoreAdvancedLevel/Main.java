package com.geekbrains.javaCoreAdvancedLevel;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.Cat;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.Human;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.Robot;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1.SuperAction;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.HavingSportParam;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.RunningTrack;
import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.Wall;

public class Main {

    public static void main(String[] args) {

        System.out.println("----Task1----");
        SuperAction[] myObjects = {new Human("Fry", 3, 1000),
                new Robot("Bender", 5, 1500),
                new Cat("Cat", 2, 80)};

        for (SuperAction myObject : myObjects) {
            myObject.run();
            myObject.jump();
        }
        System.out.println();

        System.out.println("----Task2----");
        HavingSportParam runningTrack = new RunningTrack(100);
        HavingSportParam wall = new Wall(2);

        for (SuperAction myObject : myObjects) {
            myObject.run(runningTrack);
            myObject.jump(wall);
        }
        System.out.println();

        System.out.println("----Task3----");
        HavingSportParam[] myObstacles = {new Wall(1),
                new RunningTrack(200),
                new Wall(4),
                new RunningTrack(2000)};

        for (SuperAction myObject : myObjects) {
            for (HavingSportParam myObstacle : myObstacles) {
                if (myObject.jump(myObstacle)) break;
                if (myObject.run(myObstacle)) break;
            }
        }
    }
}

