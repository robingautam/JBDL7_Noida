package org.gfg.JBDL7_UnitTesting.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@SpringBootTest
class StudentUtilityTest {

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentUtility studentUtility;


    public  void initializeMocks(){
      //  when(studentRepository.getStudentById(anyInt())).thenReturn(new Student(1,"Robin","robin@gmail.com"));
      //  when(studentRepository.getStudentById(2)).thenReturn(new Student(2,"Robin","robin@gmail.com"));
    }

    @Test
    void getStudentNameFirstCharacter() {
        initializeMocks();
        char result = studentUtility.getStudentNameFirstCharacter(10);
        Assertions.assertEquals('R',result);
    }
}