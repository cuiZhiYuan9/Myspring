package com.cui;

import com.cui.dubboAPI.MessageDeal;
import com.cui.dubboAPI.impl.MessageDealimpl;
import com.cui.pojo.bnfPojo;
import com.cui.pojo.insuredPojo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class testdubbo {
    @Test
    public void test01(){
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
        MessageDealimpl messageDealimpl = new MessageDealimpl();
        String service = messageDealimpl.service(hashMap);
        System.out.println(service);
    }
}
