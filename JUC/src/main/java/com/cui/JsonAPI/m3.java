package com.cui.JsonAPI;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class m3 {

    @JSONField(name = "Commpojo")
    private List<CommpojoDTO> commpojo;
    @JSONField(name = "insuredPojo")
    private List<InsuredPojoDTO> insuredPojo;

    @NoArgsConstructor
    @Data
    public static class CommpojoDTO {
        @JSONField(name = "name")
        private String name;
    }

    @NoArgsConstructor
    @Data
    public static class InsuredPojoDTO {
        @JSONField(name = "sex")
        private String sex;
    }
}
