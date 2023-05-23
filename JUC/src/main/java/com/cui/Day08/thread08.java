package com.cui.Day08;

import com.cui.Day08.pojo.person;
import com.cui.Day08.threadtype.M1;
import org.springframework.beans.factory.annotation.Autowired;

public class thread08 {

/*    @Autowired
    public M1 m1;*/
    public static void main(String[] args) throws InterruptedException {
        M1 m1 = new M1();
        for (int i = 0; i < 10; i++) {
            person p = new person();
            p.setName("111----"+i);
            m1.setPerson(p);
            new Thread(m1::run,"thread"+i).start();
        }
    }
}
