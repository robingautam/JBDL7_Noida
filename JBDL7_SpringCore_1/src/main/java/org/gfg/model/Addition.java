package org.gfg.model;

public class Addition {

    int num1;
    int num2;

    public Addition(int num1, int num2){
        System.out.println("Int Int");
        this.num1 = num1;
        this.num2 = num2;
    }

    public Addition(String num1, String num2){
        System.out.println("String , String");
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }


}
