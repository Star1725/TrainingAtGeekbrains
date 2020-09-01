package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.codeFromWebinar.exampleForLinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Решение проблемы для ArrayList - LinkedList
        List<Integer> integerList = new LinkedList<>();
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
////            integerList.add(i);//если i = 100000, порядка 10 мс
//            integerList.add(0, i);//если i = 100000, порядка 15 мс
//                                             //если i = 1000000, порядка 260 мс
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("time " + (end - begin) + " ms");

        //Проблема LinkedList - произвольный доступ медленнее
//        for (int i = 0; i < 10000000; i++) {
//            integerList.add(i);
//        }
//        long begin = System.currentTimeMillis();
//        System.out.println(integerList.get(5000000));//для доступа к 500000 элементу из  1000000 порядка 8 мс
//                                                     //для доступа к 5000000 элементу из 10000000 порядка 50 мс
//        long end = System.currentTimeMillis();
//        System.out.println("time " + (end - begin) + " ms");
        //Решение проблемы - ArrayList
//        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        for (int i = 0; i < 10000000; i++) {
//            integerArrayList.add(i);
//        }
//        long begin = System.currentTimeMillis();
//        System.out.println(integerArrayList.get(5000000));//для доступа к 500000 элементу порядка 0 мс
//                                                          //для доступа к 5000000 элементу из 10000000 порядка 1 мс
//        long end = System.currentTimeMillis();
//        System.out.println("time " + (end - begin) + " ms");

        //Все методы, что есть в ArrayList, есть и в LinkedList, кроме ensureCapacity() и trimToSize()
        //Сортировка LinkedList медленнее чем для ArrayList
        //В LinkedList кроме интерфейса List реализован Deque(очередь)
        //очередь можно использовать в качестве стека. offer() и poll() - для очереди, push() и pop() для стека. Это одинаковые методы
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.offer(1);
        integerQueue.offer(2);
        integerQueue.offer(3);
        for (Integer integer : integerQueue) {
            System.out.println(integer);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(integerQueue.poll());
        }
    }
}
