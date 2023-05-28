package com.cui.Day09;

import java.util.concurrent.CountDownLatch;

public class TestRunable {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Runable01 runable01 = new Runable01();
        runable01.setDownLatch(countDownLatch);
        new Thread(runable01).start();
        CountDownLatch downLatch = runable01.getDownLatch();

        Runable02 runable02 = new Runable02();
        runable02.setDownLatch(downLatch);
        new Thread(runable02).start();
    }
}
