package com.cui.Day10;

class RunnableImp implements Runnable
{
    boolean flag = true;
    Object obj1 = new Object();
    Object obj2 = new Object();
    public void run(){
        if(flag){
            synchronized(obj1){//第一个线程1先获得obj1对象锁，并将其锁住

                System.out.println(Thread.currentThread().getName()+"先获得obj1");
                try{
                    Thread.sleep(1000);//先让线程1睡眠一段时间，让线程2有时间去获得obje2对象锁
                }catch(Exception e){}
                synchronized(obj2){//线程1醒来后，想去获得obj2锁，但是此锁已经被线程2获得并锁住了，所以需要等待线程2解开obj2锁
                    System.out.println(Thread.currentThread().getName()+"想获得obj2");
                }

            }
        }else{
            synchronized(obj2){//第二个线程2在线程1睡眠时先获得obj2对象锁，同样也将其锁住

                System.out.println(Thread.currentThread().getName()+"先获得obj2");
                try{
                    Thread.sleep(1000);//让线程2睡眠一段时间，如果线程2先启动，就可以先让线程1先去获得obj1锁
                }catch(Exception e){}
                synchronized(obj1){
                    System.out.println(Thread.currentThread().getName()+"想获得obj1");
                }

            }
        }
    }
}
public class TestRunnable
{
    public static void main(String[] args)
    {
        RunnableImp r = new RunnableImp();
        Thread t1 = new Thread(r,"线程1");
        Thread t2 = new Thread(r,"线程2");
        t1.start();
        try{
            Thread.sleep(100);
        }catch(Exception e){}
        r.flag = false;
        t2.start();
    }
}