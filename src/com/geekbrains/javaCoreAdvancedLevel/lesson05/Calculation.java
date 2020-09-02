package com.geekbrains.javaCoreAdvancedLevel.lesson05;

import java.util.Arrays;

public class Calculation {
    Object monitor = new Object();

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    static float[] arr1 = new float[SIZE];
    static float[] arr2 = new float[SIZE];

    public void methodCalculation(float[] arr, int start){
        System.out.println(Thread.currentThread().getName() + " calculation start");
        for (int i = start; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        System.out.println(Thread.currentThread().getName() + " calculation finish");
    }

    public void method1(){
        Object monitor = new Object();
        long startMethod1 = System.currentTimeMillis();
        synchronized (monitor){
            methodCalculation(arr1, 0);
        }

        long stopMethod1 = System.currentTimeMillis();
        System.out.println(stopMethod1 - startMethod1);
    }

    public void method2(){
        float[] a1 = new float[HALF];
        long startMethod1 = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            methodCalculation(a1, 0);
            System.arraycopy(a1, 0, arr2, 0, HALF);
        });
        Thread t2 = new Thread(() -> {
            methodCalculation(arr2, HALF);
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long stopMethod1 = System.currentTimeMillis();
        System.out.println(stopMethod1 - startMethod1);
    }
}
