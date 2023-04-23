package com.cui.Thread04;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
//无锁优化 （自旋）
//关于Atomic  cas(compare and set /swap)基础使用案例   atomic原子性只能保证最后拿到的值是正确的，不能保证每个线程拿到的值都是正确的
//关于LongAdder 使用时，用add方法也能保证数据的原子性  ,但是只能保证最终结果的原子性，线程过程中的结果并不能保证。
public class AtomicPojo {
    AtomicInteger count = new AtomicInteger(0);
    LongAdder longAdder = new LongAdder();
    int count1 = 0;

    CountDownLatch countDownLatch;

    public void setCountDownLatch(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public void SumLongAdder(){
        for (int i = 0; i < 1000; i++) {
            longAdder.add(1);

        }
        System.out.println(Thread.currentThread().getName()+"----"+longAdder);
    }
    public long SumLongAdde1r(){
        long sum = longAdder.sum();
        return sum;
    }
    public void SumCount() {
        try {
            TimeUnit.SECONDS.sleep(1);
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        } catch (Exception e) {
            System.out.println("----有异常----");
        }
        countDownLatch.countDown();
        // System.out.println(Thread.currentThread().getName()+"="+count);
    }

    public void NosynSum(){
        for (int i = 0; i < 1000; i++) {
            count1++;
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Thread [] threads = new Thread[1000];
        AtomicPojo at = new AtomicPojo();

        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(at::SumCount);
        }
        //上个门栓
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        at.setCountDownLatch(countDownLatch);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            threads[i].start();
        }

        try {
            countDownLatch.await();
        }catch (Exception e){
            System.out.println("落下门栓出现异常！");
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间 "+(end - start));
    /*    for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }*/
        System.out.println(at.count);
        Thread [] threads1 = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(at::SumLongAdder);
        }
        //上个门栓
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("花费时间 "+(end1 - start1));
        System.out.println("33333==="+at.SumLongAdde1r());


        Thread[] threads2 = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads2[i] = new Thread(at::NosynSum);
        }
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            threads2[i].start();
        }
        long end4 = System.currentTimeMillis();
        System.out.println(end4-start3);
        System.out.println(at.count1);


    }

}
