package com.geekbrains.javaCoreAdvancedLevel.lesson_03.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<Integer>> map = new HashMap<>();

    public void add(String lastName, int phoneNumber){
        ArrayList value = map.get(lastName);
        if (value == null){
            map.put(lastName, new ArrayList(Arrays.asList(phoneNumber)));
        } else {
            value.add(phoneNumber);
            map.put(lastName, value);
        }
    }

    public void getAll(){
        for (Map.Entry<String, ArrayList<Integer>> o : map.entrySet()){
            System.out.println("Фамилия - " + o.getKey());
            System.out.println("Tелефонный номер: ");
            for (int num: o.getValue()) {
                System.out.println(num);
            }
            System.out.println();
        }
    }

    public void get(String lastName){
        System.out.println("Фамилия - " + lastName);
        System.out.println("Tелефонный номер: ");
        for (int num: map.get(lastName)) {
            System.out.println(num);
        }
        System.out.println();
    }
}
