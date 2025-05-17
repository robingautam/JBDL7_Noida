package org.gfg.mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class MappingMain {

    public static void main(String[] args) {
        Configuration configuration = new
                Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Laptop.class);
        configuration.addAnnotatedClass(org.gfg.mapping.Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Laptop laptop = new Laptop();
        laptop.setLid(1001);
        laptop.setLname("DELL");

        Laptop HP = new Laptop();
        laptop.setLid(1002);
        laptop.setLname("HP");


        org.gfg.mapping.Student student = new Student();
        student.setId(1);
        student.setName("Robin");
        student.setEmail("robin@gmail.com");
       // student.setLaptop(laptop);
        List<Laptop> laptops = Arrays.asList(laptop,HP);
        student.setLaptop(laptops);

     //   laptop.setStudent(student);
    //    HP.setStudent(student);

        session.getTransaction().begin();

        session.save(student);
        session.save(laptop);
        session.save(HP);


        session.getTransaction().commit();

        System.out.println("Data saved");

    }
}
