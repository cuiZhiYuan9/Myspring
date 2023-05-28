package com.cui.Day09;

public class TestStatic01 {
    private  TestStatic01(){};
    private static TestStatic01 static01 = new TestStatic01();

    public static TestStatic01 getTest(){
        return static01;
    }

    public static StringBuilder M1(){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = M1();
        StringBuilder stringBuilder1 = M1();
        System.out.println(stringBuilder1==stringBuilder);
        TestStatic01 test = TestStatic01.getTest();
        TestStatic01 tes2 = TestStatic01.getTest();

        System.out.println(TestStatic01.getTest()==TestStatic01.getTest());
    }
}
