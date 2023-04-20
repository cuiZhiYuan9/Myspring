package com.cui.dubboimpl;

import com.alibaba.fastjson.JSON;
import com.cui.dubboAPI.MessageDeal;
import com.cui.pojo.insuredPojo;

import java.util.HashMap;
import java.util.Map;

public class MessageDealimpl implements MessageDeal {
    public String service(HashMap json) {
        String name = "崔志远";
       /* try {
             *//*data = (insuredPojo) map.get("data");*//*
    *//*        String s = JSON.toJSONString(json);*//*
            HashMap map = JSON.parseObject(json, HashMap.class);
            Object data1 =  map.get("data");
            System.out.println(data1);

            insuredPojo insuredPojo = JSON.toJavaObject((JSON) data1, insuredPojo.class);
             name = insuredPojo.getName();


        }catch (Exception e){
            new Throwable("这里有问题");

        }*/
        return name;
    }
}
