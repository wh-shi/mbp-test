package com.xunlei.spring.resource;

import com.xunlei.spring.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shiwenhuan on 2017/2/10.
 */
public class HelloWorld {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService myService = (MyService) context.getBean("myService");
        myService.addPerson();
    }
}
