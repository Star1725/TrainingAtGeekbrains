package com.geekbrains.javaCoreAdvancedLevel.lesson01.task1;

public class Main {

    public static void main(String[] args) {

        Recruit[] myRecruits = {new Human("Fry", 3, 1000),
                new Robot("Bender", 5, 1500),
                new Cat("Cat", 2, 80)};

        SportsObstacle[] myObstacles = {new Wall(1),
                new RunningTrack(200),
                new Wall(4),
                new RunningTrack(2000)};

        System.out.println("----Start----");

        for (SportsObstacle myObstacle : myObstacles) {
            for (Recruit myRecruit : myRecruits) {
                if (!myRecruit.isFlagLoser()) {
                    myObstacle.overcomeMe(myRecruit);
                }
            }
            System.out.println();
        }
        System.out.println("----Finish----");
    }
}

