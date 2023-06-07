package com.cui.Day11;

public enum Enum_test01 {

    SUMMER("",""),
    SPRING("","");
    private String name;
    private String flag;


    Enum_test01(String name, String flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }
    public String getFlag() {
        return flag;
    }

    public static Enum getEnum(String flag){
        for (Enum_test01 value:
             Enum_test01.values()) {
            if (value.getFlag().equals(flag)){
                return value;
            }
        }
        return null;
    }


}

