package com.cui.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@Data
public class insuredPojo {
    @JSONField(alternateNames = "name" )
    private String name;
    private String sex;
    private List<bnfPojo> bnfPojoList;

}
