package com.cui.Day09;

import lombok.Data;

import java.lang.reflect.Modifier;

/**
 * 试下多线成时静态变量的值是如何该改变的
 */
public class TestStatic {
    int i;  static {
        System.out.println("11111111111");
    }

    public static void pub(String s){

        TestStatic testStatic1 = new TestStatic();
        TestStatic testStatic2 = new TestStatic();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("stringBuilder = " + stringBuilder.getClass().getModifiers());
        int modifiers = stringBuilder.getClass().getModifiers();
        System.out.println("Modifier.toString(modifiers) = " + Modifier.toString(modifiers));
        stringBuilder.append(s);
        System.out.println("stringBuilder = " + stringBuilder.toString());
        TestStatic testStatic = new TestStatic();
        int i1 = testStatic.i;
        System.out.println(i1);
    }

    public static void main(String[] args) {

/*        pub("11");
        pub("@2");*/
       /* System.out.println("pub(\"1234\") = " + pub("1234"));
        System.out.println("pub(\"2346\") = " + pub("2346"));*/
     /*   for (int i = 0; i < 100; i++) {
            new Thread02(5).start();
        }*/
        Thread01 thread01 = new Thread01(5);
        for (int i = 0; i < 100; i++) {
            new Thread(thread01).start();
        }
      /*  Thread03 thread03 = new Thread03();
        for (int i = 0; i < 10000; i++) {
            new Thread(thread03::M1).start();
        }*/
     /*   for (int i = 0; i < 100; i++) {
            new Thread(new Thread03()::M1).start();
        }*/

    }


}



@Data
class Thread01 implements Runnable{
    static {
        System.out.println("11111111111");
    }

  /*  private static int i;
    @Override
    public void run() {
        i+=i;
        System.out.println("i = " + Thread.currentThread().getName()+i);
    }*/
  private  int i;
    @Override
    public void run() {
        i+=i;
        System.out.println(Thread.currentThread().getName()+"---------"+i);
    }
    public  Thread01(int i ){
        this.i = i;
    }
}
@Data
class Thread02 extends Thread {
    private  int i;
    @Override
    public void run() {
        i+=i;
        System.out.println(Thread.currentThread().getName()+"---------"+i);
    }
/*    public  Thread02(int i ){
        this.i = i;
    }*/
}
@Data
class Thread03{
    private int i;
    public void M1(){
        if (!Thread.currentThread().getName().equals("Thread-0")){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        synchronized (this){ i++; System.out.println(Thread.currentThread().getName()+"------------"+i);}

    }


}

