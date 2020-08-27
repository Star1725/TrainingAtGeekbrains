package com.geekbrains.javaCoreAdvancedLevel.lesson_01.additional_task;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static String getWorkingHours(DayOfWeek day) {
        if (day.ordinal() == 4) {
            return "" + 7;
        } else if (day.ordinal() == 5 || day.ordinal() == 6) {
            return "Выходной";
        }
        else {
            return "" + (40 - day.ordinal()*8);
        }
    }
}
