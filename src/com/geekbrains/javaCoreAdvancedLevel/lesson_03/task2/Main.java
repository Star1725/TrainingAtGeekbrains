package com.geekbrains.javaCoreAdvancedLevel.lesson_03.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook myPhonebook = new Phonebook();
        myPhonebook.add("Иванов", 123);
        myPhonebook.add("Иванов", 321);
        myPhonebook.add("Петров", 123);
        myPhonebook.add("Сидоров", 321);
        myPhonebook.add("Антихристов", 666);
        myPhonebook.add("Сидоров", 555555555);

        myPhonebook.get("Иванов");
        System.out.println("Все записи справочника:");
        myPhonebook.getAll();
    }
}
