package com.cui.Day09;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;
@Data
@NoArgsConstructor
public class Runable01 implements Runnable{
    @Autowired
    CountDownLatch downLatch;
    @Override
    public void run() {
        System.out.println(111);
        downLatch.countDown();
    }

    public void setDownLatch(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }
}
