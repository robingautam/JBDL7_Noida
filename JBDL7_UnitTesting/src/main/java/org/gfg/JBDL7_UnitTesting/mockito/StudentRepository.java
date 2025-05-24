package org.gfg.JBDL7_UnitTesting.mockito;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student getStudentById(int id){
        return new Student(11,"Robin","rob@gmail.com");
    }
}
