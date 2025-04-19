package org.gfg.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DBOperationMain {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");

         DBOperation dbOperation = applicationContext.getBean("db", DBOperation.class);
        applicationContext.registerShutdownHook();
        System.out.println(dbOperation);
    }
}
