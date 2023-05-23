package com.cui.Day08.threadtype;

import com.alibaba.dubbo.config.annotation.Service;
import com.cui.Day08.pojo.person;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Currency;

@Data
@Service
@NoArgsConstructor
public class M1 implements Runnable{
    private com.cui.Day08.pojo.person person;
    @Override
    public void run() {
        System.out.println(person.getName());
    }

}
