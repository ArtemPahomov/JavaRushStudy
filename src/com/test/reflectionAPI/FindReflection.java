package com.test.reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FindReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        MyClass myClass= null;

        Class clazz = Class.forName(MyClass.class.getName());
        Class[]param = {int.class,String.class};
        myClass = (MyClass) clazz.getConstructor(param).newInstance(1,"default2");
        System.out.println(myClass);

        int number = myClass.getNumber();
        String name = null;


        Field field = myClass.getClass().getDeclaredField("name");//вернуть поле по названию
        field.setAccessible(true);//дать доступ для работы с полем
        field.set(myClass,"new value");
        name=(String)field.get(myClass);

        printData(myClass);

        Constructor[]constructors=clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
        }


    }
    public static void printData(Object myClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = myClass.getClass().getDeclaredMethod("printData");// получаем нужный метод зная его имя
        method.setAccessible(true);//даем доступ к полю
        method.invoke(myClass);
    }
}
