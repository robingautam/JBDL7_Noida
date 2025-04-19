package org.gfg.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowiremain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireconfig.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee);

    }
}
