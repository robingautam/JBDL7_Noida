package OOP.polymorphism;

import OOP.Inheritance.Parent;

public class Main {

    public static void main(String[] args) {
      /*  Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));*/

        Parent parent = new Child();
        parent.someMethod();
    }
}
