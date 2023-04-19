package com.cui.Thread2;

import com.cui.JsonAPI.Test03;
import com.cui.T;

import java.util.concurrent.TimeUnit;

public class SyncObjectOver {

    final Thread03 o = new Thread03();
    void m(){
        synchronized (o){
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        SyncObjectOver sync = new SyncObjectOver();
        Thread yy = new Thread(sync::m, "yy");
        System.out.println(sync.o);
        yy.start();


    }
}
