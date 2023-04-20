package com.cui.Thread03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;
@Service
public class M4 {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    @Autowired
    private m1 m1;
    public void m2()  {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"==="+m1);
        m1.setAge(i++);
        System.out.println(Thread.currentThread().getName()+"===="+m1.getAge());

    }
}
