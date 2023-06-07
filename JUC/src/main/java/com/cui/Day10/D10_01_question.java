package com.cui.Day10;

import java.util.ArrayList;
import java.util.List;

public class D10_01_question {
    String Arr1[] = {"A", "B", "C"};
    int Arr2[] = {1, 2, 3};

    public synchronized void M1() {
        for (int i = 0; i < Arr1.length; i++) {
            try {
                System.out.print(Arr1[i]);
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void M2() {

        for (int i = 0; i < Arr2.length; i++) {
            try {
                System.out.print(Arr2[i]);
                this.notify();
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        D10_01_question d10_01_question = new D10_01_question();
   /*     new Thread(d10_01_question::M2).start();
        new Thread(d10_01_question::M1).start();*/
        List<Thread> lists = new ArrayList<>();
        Thread thread = new Thread(d10_01_question::M2);
        Thread thread1 = new Thread(d10_01_question::M1);
        lists.add(thread);
        lists.add(thread1);
        for (Thread t : lists
        ) {
            t.start();
        }
    }
}
