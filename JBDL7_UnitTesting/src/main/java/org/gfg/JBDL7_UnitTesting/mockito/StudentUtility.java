package org.gfg.JBDL7_UnitTesting.mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentUtility {

    @Autowired
    StudentRepository studentRepository;

    public char getStudentNameFirstCharacter(int id){
        Student student = studentRepository.getStudentById(id);
        return student.getName().charAt(0);
    }
}
