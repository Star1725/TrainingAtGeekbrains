package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.codeFromWebinar.exampleForMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();//запоминает порядок добаления элементов
//        Map<String, Integer> map = new TreeMap<>();//сразу сортирует

        map.put("Tom", 5);
        map.put("Fedor", 8);
        map.put("Barsik", 12);
        map.put("Barsik", 2);//перепишет 12 на 2
//        System.out.println(map);
//        map.forEach((k, v) -> {
//            System.out.print("key: " + k);
//            System.out.println(", value: " + v);
//        });
        //раньше делали так
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.print("key: " + entry.getKey());
//            System.out.println(", value: " + entry.getValue());
//        }
        //можно вытащить множество ключей
        Set<String> set = map.keySet();
        System.out.println(set);
        //можно вытащить коллекцию значений
        Collection<Integer> values = map.values();
        System.out.println(values);
        //?????????????????????
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

    }
}
