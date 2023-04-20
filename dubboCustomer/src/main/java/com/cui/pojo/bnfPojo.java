package com.cui.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class bnfPojo implements Serializable {
    private String bnfName;
    private String bnfsex;
}
