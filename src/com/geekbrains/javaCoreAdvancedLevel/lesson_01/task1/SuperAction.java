package com.geekbrains.javaCoreAdvancedLevel.lesson_01.task1;

import com.geekbrains.javaCoreAdvancedLevel.lesson_01.task2.HavingSportParam;

public interface SuperAction extends Running, Leaping{
    void run(HavingSportParam track);
    void jump(HavingSportParam wall);
}
