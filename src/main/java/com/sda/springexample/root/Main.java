package com.sda.springexample.root;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{"tools.xml", "worker.xmml"};
        ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext(beans);
    }
}
