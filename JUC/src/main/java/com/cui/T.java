package com.cui;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class T {

    public void m1(){
        try {
            Thread.sleep(5000);
            synchronized (this){
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);

                }
            }

        }catch (Exception e){

        }
        System.out.println("这里是m1");
    }
    public void m2(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("这里是m2");
    }

    public static void main(String[] args) throws InterruptedException {
//        T t = new T();
//        new Thread(t::m1,"t1").start();
//        new Thread(t::m2,"t2").start();
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                objects.add(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(objects.size());
    }
}
