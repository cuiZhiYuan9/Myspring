package com.cui.Thread2;

import com.cui.T;

import java.util.concurrent.TimeUnit;

public class Sychronized01  {
    int num = 0;
    public synchronized void test01() throws InterruptedException {
        while (true){
            num++;
            System.out.println(Thread.currentThread().getName()+"---="+num);
            if (num == 5){
                int i = num / 0;
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Sychronized01 l1 = new Sychronized01();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    l1.test01();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(runnable,"l1").start();
        TimeUnit.SECONDS.sleep(3);
        new Thread(runnable,"l2").start();
    }



}
