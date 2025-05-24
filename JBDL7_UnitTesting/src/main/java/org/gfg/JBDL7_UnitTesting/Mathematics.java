package org.gfg.JBDL7_UnitTesting;

import org.springframework.stereotype.Component;

@Component
public class Mathematics {

    public int getSum(int a, int b){
        return a+b;
    }


    public char getMiddleCharacter(String s){
        if (s.length()==0){
            return ' ';
        }
        int index = s.length()/2;
        if (s.length()%2==0){
            return s.charAt(index-1);
        }else {
            return s.charAt(index);
        }
    }

}
