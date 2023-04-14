package com.cui;

import com.cui.Abstract.Abstract_01;
import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class abstractTest {
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.cui.Abstract.Abstract_01");
        System.out.println(Modifier.toString(aClass.getModifiers()));
        Method test = aClass.getMethod("test");
        System.out.println(Modifier.toString(test.getModifiers()));
   /*     System.out.println(modifiers1+"="+modifiers1);

        System.out.println("aClass = " + aClass);
        int modifiers = aClass.getModifiers();

        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod.getName());
            System.out.println("22222"+declaredMethod.getParameterTypes()
            );
            System.out.println("33333"+declaredMethod.getReturnType());
        }
        System.out.println(modifiers);*/
    }
}
