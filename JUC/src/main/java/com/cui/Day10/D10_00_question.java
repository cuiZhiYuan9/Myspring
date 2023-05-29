package com.cui.Day10;

import java.util.List;
import java.util.concurrent.locks.LockSupport;

//要求用线程打印A1B2C3..Z26


public class D10_00_question {
    static String Arr1[] = {"A","B","C"};
    static int Arr2[] = {1,2,3};
    static Thread thread01;
    static Thread thread02 ;
/*    public static void main(String[] args) {
        //线程1打印A-Z  --这里用了LockSupport的是park挂起线程 和 unpark叫起指定线程
         thread01 = new Thread(() -> {
            for (int i = 0; i < Arr1.length; i++) {
                System.out.print(Arr1[i]);
                LockSupport.unpark(thread02);
                LockSupport.park();
            }
        },"t1");
        //线程2打印1-26
         thread02 = new Thread(() -> {
             LockSupport.park();
            for (int i = 0; i < Arr2.length; i++) {
                System.out.print(Arr2[i]);
                LockSupport.unpark(thread01);
                LockSupport.park();
            }

        },"t2");
        thread01.start();
        thread02.start();

    }*/
    //使用notify notfiyall ,wait来试下
public static void main(String[] args) {
    thread01 = new Thread(()->{
        for (int i = 0; i < Arr1.length; i++) {
            System.out.println(Arr1[i]);
          //  thread01.notifyAll();

            try {
                thread01.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread01.notify();
            //  Thread.yield();
        }
    });
    thread02 = new Thread(()->{
        try {
            thread02.wait();
            for (int i = 0; i < Arr2.length; i++) {
                System.out.println(Arr2[i]);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });
    thread01.start();
    thread02.start();
}


}
