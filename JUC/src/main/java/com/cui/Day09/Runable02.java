package com.cui.Day09;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;
@Data
@NoArgsConstructor
public class Runable02 implements Runnable{
    @Autowired
    CountDownLatch downLatch;
    @Override
    public void run() {
        try {
            downLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

    }
}
