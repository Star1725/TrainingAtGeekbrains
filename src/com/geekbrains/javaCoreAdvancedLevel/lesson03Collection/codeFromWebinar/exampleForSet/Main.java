package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.codeFromWebinar.exampleForSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> integerSet1 = new HashSet<>();//внутри HashMap, для двух нижних аналогично
//        Set<Integer> integerSet2 = new LinkedHashSet<>();//запоминает порядок добаления элементов
//        Set<Integer> integerSet3 = new TreeSet<>();//сразу сортирует
//        integerSet1.addAll(Arrays.asList(1,35,11111,678,456,70,2,1,11111,35,28));
//        integerSet2.addAll(Arrays.asList(1,35,11111,678,456,70,2,1,11111,35,28));
//        integerSet3.addAll(Arrays.asList(1,35,11111,678,456,70,2,1,11111,35,28));
//        System.out.println(integerSet1);
//        System.out.println(integerSet2);
//        System.out.println(integerSet3);

        //
        Set<Integer> setA = new TreeSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(5,6,7,8));
        System.out.println("A: " + setA);
        System.out.println("B: " + setB);
        //
//        setA.retainAll(setB);//пересечение А и В, и записываем результат в setA
//        System.out.println("A retain B: " + setA);
        //
//        setA.removeAll(setB);//вычетание из А
//        System.out.println("A - B: " + setA);
        //
        setA.addAll(setB);//сложение и получение всех элементов в единственных экземплярах
                          //ghb использовании для ArrayList, мы получим общий массив с дублирующими элементами
        System.out.println("A + B: " + setA);
    }
}
