package org.gfg.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Student student = applicationContext.getBean("aliasst", Student.class);
        Student student2 = applicationContext.getBean("aliasst", Student.class);
      //  applicationContext.registerShutdownHook();
    //    System.out.println(student.hashCode());
      //  System.out.println(student2.hashCode());
        System.out.println(student2);
    }
}
