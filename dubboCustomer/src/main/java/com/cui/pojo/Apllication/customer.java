package com.cui.pojo.Apllication;

import com.cui.dubboAPI.MessageDeal;
import com.cui.pojo.bnfPojo;
import com.cui.pojo.insuredPojo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;

public class customer {
    public static void main(String[] args) {
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
        String service = bean.service(hashMap);
        System.out.println(service);
    }
}
