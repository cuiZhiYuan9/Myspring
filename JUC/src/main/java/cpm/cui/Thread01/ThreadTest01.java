package cpm.cui.Thread01;

public class ThreadTest01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("这是thread01");
        }
    }

    //内部类应用场景：1.当某个类只为一个类提供服务时，可以将这个类定义成内部类
    //
    //  2.可以解决接口或者抽象类不能实例化的问题
    class Thread02 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

                System.out.println("这里是Thread02");
            }
        }
    }
}
