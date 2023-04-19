package com.cui.dubboimpl;

import com.cui.dubboAPI.MessageDeal;
import com.cui.pojo.insuredPojo;

import java.util.Map;

public class MessageDealimpl implements MessageDeal {
    public String service(Map<String, Object> map) {
        insuredPojo data = null;
        try {
             data = (insuredPojo) map.get("data");

        }catch (Exception e){
            System.out.println(data);
            new Throwable("这里有问题");

        }
        String name1 = data.getName();
        System.out.println("name1 = " + name1);
        return data.toString();
    }
}
