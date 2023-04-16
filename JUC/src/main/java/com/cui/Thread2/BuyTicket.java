package com.cui.Thread2;

import com.cui.T;

public class BuyTicket {


   public static void main(String[] args) {
      Ticket ticket = new BuyTicket().new Ticket();
      new Thread(ticket::run,"我是黄牛1号").start();
      new Thread(ticket::run,"我是黄牛2号").start();
      new Thread(ticket::run,"我是黄牛3号").start();
   }

   class Ticket extends Thread {
      int num = 10;
      boolean flag = true;

      @Override
      public void run() {
         while (flag){
            //最后一同时都在等锁
            buy();

            System.out.println(Thread.currentThread().getName()+"锁走完了吗");

         }


      }

      private synchronized void buy() {
         if(num<=0){
            flag =false;
            return;
         }
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
           System.out.println(Thread.currentThread().getName()+num--+"张票");

      }
   }
}
