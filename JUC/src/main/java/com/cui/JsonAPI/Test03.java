package com.cui.JsonAPI;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
public class Test03 {

    @JSONField(name = "resultcode")
    private String resultcode;
    @JSONField(name = "reason")
    private String reason;
    @JSONField(name = "result")
    private ResultDTO result;
    @JSONField(name = "error_code")
    private Integer errorCode;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class ResultDTO {
        @JSONField(name = "data")
        private List<DataDTO> data;
        @JSONField(name = "totalNum")
        private String totalNum;
        @JSONField(name = "pn")
        private Integer pn;
        @JSONField(name = "rn")
        private String rn;

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class DataDTO {
            @JSONField(name = "id")
            private String id;
            @JSONField(name = "title")
            private String title;
            @JSONField(name = "tags")
            private String tags;
            @JSONField(name = "imtro")
            private String imtro;
            @JSONField(name = "ingredients")
            private String ingredients;
            @JSONField(name = "burden")
            private String burden;
            @JSONField(name = "albums")
            private List<String> albums;
            @JSONField(name = "steps")
            private List<StepsDTO> steps;

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class StepsDTO {
                @JSONField(name = "img")
                private String img;
                @JSONField(name = "step")
                private String step;
            }
        }
    }
}
