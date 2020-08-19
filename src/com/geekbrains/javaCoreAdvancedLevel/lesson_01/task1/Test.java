package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        SuperAction[] myObjects = {new Human("Fry"), new Robot("Bender"), new Cat("Cat")};

        for (SuperAction myObject : myObjects) {
            myObject.run();
            myObject.jump();
        }
    }
}
