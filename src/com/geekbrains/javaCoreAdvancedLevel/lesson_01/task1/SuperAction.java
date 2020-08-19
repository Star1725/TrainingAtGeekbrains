package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.HavingSportParam;

public interface SuperAction extends Running, Leaping{
    boolean run(HavingSportParam track);
    boolean jump(HavingSportParam wall);
}