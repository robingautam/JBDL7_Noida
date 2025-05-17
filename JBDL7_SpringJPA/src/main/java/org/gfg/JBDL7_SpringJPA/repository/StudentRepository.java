package org.gfg.JBDL7_SpringJPA.repository;

import jakarta.transaction.Transactional;
import org.gfg.JBDL7_SpringJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


     Student findByName(String name);

     Student findByEmail(String email);

     Student findByEmailAndName(String email, String name);

    Student findByEmailOrName(String email, String name);

    Student findByAgeGreaterThan(int age);

    @Query("from student s where s.name=:name and s.email=:email")
    Student findByNameAndEmailCustomQuery(String name, String email);

    @Query(value = "update student s set s.email=:email where s.id=:id")
    @Modifying
    @Transactional
    void updateEmailById(int id, String email);
}
