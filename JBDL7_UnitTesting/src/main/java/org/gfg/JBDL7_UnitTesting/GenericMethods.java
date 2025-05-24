package org.gfg.JBDL7_UnitTesting;

import org.springframework.stereotype.Component;

@Component
public class GenericMethods {


    public char getFirstCharacter(String s){
        if (s.length()==0){
            return ' ';
        }
        return s.charAt(0);
    }

    public char getLastCharacter(String s){
        if (s.length()==0){
            return ' ';
        }
        return s.charAt(s.length()-1);
    }
}
