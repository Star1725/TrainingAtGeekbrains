package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.homework.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook myPhonebook = new Phonebook();
        System.out.println("Заполнение справочника:");
        myPhonebook.add("Иванов", 123);
        myPhonebook.add("Иванов", 321);
        myPhonebook.add("Петров", 123);
        myPhonebook.add("Сидоров", 321);
        myPhonebook.add("Антихристов", 666);
        myPhonebook.add("Сидоров", 555);
        myPhonebook.add("Иванов", 222);
        System.out.println();
        myPhonebook.get("Иванов");
        System.out.println();
        myPhonebook.get("Гречкин");
        System.out.println();
        System.out.println("Все записи справочника:");
        myPhonebook.getAll();
    }
}
