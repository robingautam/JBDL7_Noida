package org.gfg.JBDL7_UnitTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GenericMethodsTest {

    @Autowired
    GenericMethods genericMethods;

    @Test
    void getFirstCharacter() {
        char res = genericMethods.getFirstCharacter("ro");
        Assertions.assertEquals('r',res);
    }

    @Test
    void getLastCharacter() {
        char res = genericMethods.getLastCharacter("ro");
        Assertions.assertEquals('o',res);
    }
}