package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.homework.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> stringArrayList = new ArrayList<>();
        Map<Integer, Integer> integerCountMap = new TreeMap<>();

        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(20);
            stringArrayList.add(String.valueOf(num));
            Integer value = integerCountMap.getOrDefault(num, 0);
            integerCountMap.put(num, value + 1);
        }
        System.out.println(stringArrayList);
        System.out.println("Unique numbers for array:");
        for (Map.Entry<Integer, Integer> entry : integerCountMap.entrySet()) {
            System.out.print(entry.getValue() == 1 ? entry.getKey() + " " : "");
        }
        System.out.println();
        System.out.println("Count duplicates numbers in array:");

        System.out.println(integerCountMap);


    }
}
