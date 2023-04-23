package com.cui.pojo.Apllication;

import com.alibaba.fastjson.JSON;
import com.cui.dubboAPI.MessageDeal;
import com.cui.pojo.bnfPojo;
import com.cui.pojo.insuredPojo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

public class customer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbocustomer.xml");
        context.start();
        System.out.println("customer start");
        MessageDeal bean = context.getBean(MessageDeal.class);
        insuredPojo insuredPojo = new insuredPojo();
        bnfPojo bnfPojo = new bnfPojo();
        insuredPojo.setName("崔志远");
        insuredPojo.setSex("男");
        bnfPojo.setBnfName("崔思远");
        bnfPojo.setBnfsex("男");
        ArrayList<bnfPojo> bnfpojolist = new ArrayList<>();
        bnfpojolist.add(bnfPojo);
        insuredPojo.setBnflist(bnfpojolist);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("data",insuredPojo);
     //   String s = JSON.toJSONString(hashMap);
        String s = JSON.toJSONString(hashMap);
        String name = "崔志远";
     /*   for (int i = 0; i < 10; i++) {
            String name1 = bean.service(name);
            System.out.println(name1);
        }*/
        long start = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(10000);//3962 //3727
        for (int i = 0; i < 10000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String service = bean.service(name);
                    System.out.println(service);
                    countDownLatch.countDown();
                }
            }).start();
        }
        try{
            countDownLatch.await();
        }catch (Exception e){

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
