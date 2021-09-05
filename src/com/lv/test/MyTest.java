package com.lv.test;

import com.lv.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person =(Person) context.getBean("person");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
