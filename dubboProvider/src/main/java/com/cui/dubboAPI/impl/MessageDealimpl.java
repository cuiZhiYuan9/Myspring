package com.cui.dubboAPI.impl;

import com.cui.pojo.insuredPojo;
import com.cui.dubboAPI.MessageDeal;

import java.util.Map;

public class MessageDealimpl implements MessageDeal {
    @Override
    public String service(Map<String, Object> map) {
        insuredPojo data = null;
        try {
             data = (insuredPojo) map.get("data");

        }catch (Exception e){
            System.out.println(data);
            new Throwable("这里有问题");

        }
        String name1 = data.getName1();
        System.out.println("name1 = " + name1);
        return data.toString();
    }
}
