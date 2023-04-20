package com.cui.Thread03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testm1 {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(springconfig.class);
        M4 bean = context.getBean(M4.class);
        bean.setI(10);
            new Thread(bean::m2, "t1").start();
   /*         bean.setI(15);
            new Thread(bean::m2,"t2").start();*/
    }
}

