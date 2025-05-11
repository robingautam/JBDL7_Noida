package org.gfg;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Configuration configuration = new
                Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Employee employee = new Employee(2, "Robin", "robin@gmail.com");
       // Student student = new Student(2, "aakash", "aakash@gmail.com");
        Student student = new Student();
        student.setName("AAkash");
        student.setEmail("aakash@gmail.com");
        session.getTransaction().begin();
       // session.save(employee);

      //  session.save(student);
   //     int c = 10/0;
        // update
     /*   Student load = session.get(Student.class,1); // fetch the data from database
        System.out.println(load);
        load.setName("Rohit");
        session.save(load);*/

        // delete
      //   session.delete(load); // It will delete the data

     //   session.save(student);


        // caching
        Student load = session.get(Student.class,1);
        Student load2 = session.get(Student.class,1);

        System.out.println(load);
        System.out.println(load2);

        session.getTransaction().commit();

        session.getTransaction().begin();
        Session session2  = sessionFactory.openSession();
        Student load3 = session2.get(Student.class,1);
        System.out.println(load3);
        session.getTransaction().commit();


        System.out.println("Data saved");
    }
}
