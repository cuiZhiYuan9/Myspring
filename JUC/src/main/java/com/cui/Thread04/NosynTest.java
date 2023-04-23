package com.cui.Thread04;

//测试下for循环的情况下是否是多线程，是否数据安全。
public class NosynTest {
    int i = 0;
    public void test(){
        i++;
        System.out.println(Thread.currentThread().getName()+"=="+i);
    }

    public static void main(String[] args) {
        NosynTest nosynTest = new NosynTest();
        for (int i = 0; i < 100; i++) {
            nosynTest.test();
        }
    }
}
