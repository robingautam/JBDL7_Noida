package org.gfg.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.gfg.Student;

public class JPAMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Robin");
        student.setEmail("robin@gmail.com");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernateDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.persist(student);
        System.out.println("data saved");
    }
}
