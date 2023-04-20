package com.cui.Thread01.Json;

import com.alibaba.fastjson.JSON;
import com.cui.JsonAPI.Test03;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test {
    @Test
    public void test(){
   /*     String jsonStr = FileUtil.readUtf8String(new File("C:\\Users\\czy98\\Desktop\\json.txt"));
        HashMap hashStr = JSON.parseObject(jsonStr, HashMap.class);
        System.out.println("hashStr==="+hashStr);
        String [] data1 = (String[]) hashStr.get("data");
        System.out.println(data1);

        //System.out.println(jsonStr);
        Test03 resp = JSON.parseObject(jsonStr, Test03.class);

        System.out.println("resp====="+resp);
        System.out.println(resp.getErrorCode());
        List<Test03.ResultDTO.DataDTO> data = resp.getResult().getData();
        for (Test03.ResultDTO.DataDTO datum : data) {
            System.out.println("datum = " + datum.getId());

        }
*/
    }

    @Test
    public void test01(){

        //这里为什么无法转换成hashmap
/*        String s = FileUtil.readUtf8String(new File("C:\\Users\\czy98\\Desktop\\111.txt"));
       *//* HashMap hashMap = JSON.parseObject(s, HashMap.class);
        System.out.println("hashMap = " + hashMap);
        Object commpojo = hashMap.get("Commpojo");*//*
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1","2");
        System.out.println("objectObjectHashMap = " + objectObjectHashMap);*/
    }
}
