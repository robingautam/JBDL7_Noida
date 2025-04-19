package org.gfg.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FileOperationMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collectionconfig.xml");
        FileOperation fileOperation = applicationContext.getBean("fileOperation", FileOperation.class);

        System.out.println(fileOperation);
    }
}
