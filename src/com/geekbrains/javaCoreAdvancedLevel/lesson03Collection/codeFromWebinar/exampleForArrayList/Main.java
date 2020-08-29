package com.geekbrains.javaCoreAdvancedLevel.lesson03Collection.codeFromWebinar.exampleForArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(20);
        integerArrayList.add(346);
        integerArrayList.add(2);
        integerArrayList.add(23873);

        //удаление по индексу
//        integerArrayList.remove(2);
//        System.out.println(integerArrayList);

        //удаление по значению
        //integerArrayList.remove((Integer) 2);//удалит только первую 2
//        integerArrayList.removeIf(x -> x.equals(2));//для элемента х, усли х = 2, то удали его. Удаляет все элементы х
//        integerArrayList.removeIf(x -> x % 2 != 0);//Удаляет все элементы нечётные х
//        System.out.println(integerArrayList);

        //Так неправильно!!!
        for (Integer integer : integerArrayList) {
            if (integer.equals(2)){
                integerArrayList.remove(integer);
            }
        }

        //удаление по старинке(через итератор)
//        Iterator<Integer> integerIterator = integerArrayList.iterator();
//        while (integerIterator.hasNext()){
//            if (integerIterator.next().equals(2))
//                integerIterator.remove();
//        }
//        System.out.println(integerArrayList);

        //удаление всех через коллекцию
//        integerArrayList.removeAll(Arrays.asList(2));
//        System.out.println(integerArrayList);

        //вставка
//        integerArrayList.add(2, 10);
//        System.out.println(integerArrayList);

        //сортитровка
//        integerArrayList.sort(Comparator.naturalOrder());//по возрастанию
//        integerArrayList.sort(Comparator.reverseOrder());//по убыванию
//        integerArrayList.sort(Comparator.comparingInt(x -> String.valueOf(x).length()));//по длинне x
//        integerArrayList.sort(Comparator.comparing(x -> String.valueOf(x)));//лексографически
//        integerArrayList.sort(Comparator.comparing(x -> x % 10));//по последне цифре
//        System.out.println(integerArrayList);

        //поиск
//        System.out.println(integerArrayList.indexOf(2));//поиск индекса первой 2(если она не одна)
//        System.out.println(integerArrayList.lastIndexOf(2));//поиск индекса последней 2(если она не одна)

        //замена всех
//        integerArrayList.replaceAll(x -> 6);
//        System.out.println(integerArrayList);

        //ТОЛЬКО ДЛЯ ArrayList
        //установка велечины внутреннего массива(по умалчанию размер 10. При достижении лимита внутри создаётся новый удвоенный (20)
        //массив, и туда перекопируется. Если нужно вставить много элементов (>1000), то будет долгое перекопирование.
        //В этом случае стоит сразу указать нужный размер
        //integerArrayList.ensureCapacity(1000);
        //урезать внутренний массив до текущего
        //integerArrayList.trimToSize();
        //ListIterator - ТОЛЬКО ДЛЯ интерфейса List
//        ListIterator<Integer> listIterator = integerArrayList.listIterator();
//        while (listIterator.hasNext()){
//            System.out.print(listIterator.next() + " ");
//        }
//        System.out.println();
//        while (listIterator.hasPrevious()){
//            System.out.print(listIterator.previous() + " ");
//        }

        //НЕДОСТАТОК ArrayList
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
////            integerArrayList.add(i);//если i = 100000, порядка 12 мс
//            integerArrayList.add(0, i);//если i = 100000, порядка 1000 мс
//                                             //если i = 1000000, порядка 140000 мс
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("time " + (end - begin) + " ms");

        //Решение проблемы для ArrayList - LinkedList
//        List<Integer> integerList = new LinkedList<>();
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
////            integerList.add(i);//если i = 100000, порядка 10 мс
//            integerList.add(0, i);//если i = 100000, порядка 15 мс
//            //если i = 1000000, порядка 260 мс
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("time " + (end - begin) + " ms");
    }
}
