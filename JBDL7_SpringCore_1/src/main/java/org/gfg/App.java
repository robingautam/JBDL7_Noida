package org.gfg;


import org.gfg.model.Addition;
import org.gfg.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Employee employee = new Employee(); // but it's not recommended

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
     //   Employee employee = applicationContext.getBean("emp", Employee.class);

//        System.out.println(employee);

        Addition addition = applicationContext.getBean("add", Addition.class);

        //Employee emp = new Employee(1,"Robin","robin@gmail,com"); // not recommended




    }
}
