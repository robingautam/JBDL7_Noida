package org.gfg.JBDL7_UnitTesting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MathematicsTest {

    @Autowired
    Mathematics mathematics;

    @Test
    void getSum() {

        int result = mathematics.getSum(2,3);
        Assertions.assertEquals(5,result);
    }

    @Test
    void getSum2() {
        int result = mathematics.getSum(2,3);
        Assertions.assertEquals(5,result);
    }

    @Test
    void getMiddleCharacter() {
        char res = mathematics.getMiddleCharacter("");
        Assertions.assertEquals(' ',res);
    }

    @ParameterizedTest
    @CsvSource({"2,3,5","10,9,19","2,-1,1","3,7,101"})
    void getSumParameterized(int a, int b, int expected) {
        int result = mathematics.getSum(a,b);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"jbdl7_tests.csv"}, numLinesToSkip = 1)
    void getSumParameterizedFile(int a, int b, int expected) {
        int result = mathematics.getSum(a,b);
        Assertions.assertEquals(expected,result);
    }

    @BeforeEach
    public void beforeEachMethod(){
        System.out.println("Before Each");
    }




}