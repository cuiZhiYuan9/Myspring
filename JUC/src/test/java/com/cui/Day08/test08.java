package com.cui.Day08;

import com.cui.pojo.person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test08 {
    @Test
    public void test01(){
        List<String> s1 = new ArrayList<String>();
        String s2 = new String();
        for (int i = 0; i < 10; i++) {
            s2="111"+i;
            s1.add(s2);
        }
        System.out.println("s1 = " + s1);

    }
    @Test
    public void test02(){
       /* person person = new person();
        Class aClass = person.getClass();*/
        List<person> list = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            person person = new person();
            person.setName("崔支援"+i);
            person.setSex("男"+i);
            list.add(person);

        }
        System.out.println(list);

    }


}
