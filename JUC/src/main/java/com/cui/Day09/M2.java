package com.cui.Day09;

import lombok.Synchronized;

//写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，当个数到5个时，线程2给出提示并结束线程2
public class M2 {
    //
    int count = 0;
    public void F1(){
        for(int i =0;i<10;i++){
            count++;
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }
    public void  F2(){


        System.out.println("count="+count);
        if(count==5){
            System.out.println("count已经加到5了");
        }
    }

    public static void main(String[] args)  {
        M2 m2 = new M2();
        new Thread(m2::F1).start();
        for (int i = 0; i < 1000; i++) {
            new Thread(m2::F2).start();
        }
    }


}
