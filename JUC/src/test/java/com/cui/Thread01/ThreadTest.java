package com.cui.Thread01;

import org.junit.Test;

public class ThreadTest {
    //线程的六种状态
    //new - >  runnable(就绪/运行) -> 时间等待-->等待 ->blocked-》TERMINATED
    @Test
    public void testTheadJoin() throws InterruptedException {
        ThreadTest01 threadTest01 = new ThreadTest01();
        threadTest01.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("这是测试主方法");
            Thread.yield();
        }
    }
    @Test
    public void testInClass(){
        ThreadTest01 threadTest01 = new ThreadTest01();

    }
}
