package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {
        /*CustomClass<Integer,Double> customClass = new CustomClass();
        double d = 34.5;
        customClass.printData(23,d);*/

       /* MathsGeneric<Integer,Long> mathsGeneric = new MathsGeneric();
        mathsGeneric.add(2,2l);*/

        List<Integer> list = new ArrayList();
        list.add(23);
        list.add(45);
        int sum = 0;
        for (int i=0;i<list.size();i++){
            sum = sum+(int) list.get(i);
        }
        System.out.println(sum);
    }
}
