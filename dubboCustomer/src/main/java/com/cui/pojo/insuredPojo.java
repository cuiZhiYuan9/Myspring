package com.cui.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
@NoArgsConstructor
@Data
public class insuredPojo implements Serializable {
    private String name;
    private String sex;
    private List<bnfPojo> bnflist;
}
