package com.cui.Thread2;

/**
 * 如果多线程访问同一资源，当一个线程被锁部分堵塞，那没锁的部分会执行吗
 */
public class Thread03 {

    class m1 implements Runnable {

        int num=10;

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"---->"+num--);
                if (num<=0)break;
            }

            m2();

        }
        public void m2(){
            System.out.println("这里是m2");
        }


    }

    public static void main(String[] args) {
        m1 m1 = new Thread03().new m1();
        new Thread(m1,"是线程1").start();
        new Thread(m1,"是线程2").start();
    }
}
