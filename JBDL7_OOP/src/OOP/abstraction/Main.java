package OOP.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       /* General person = new Person();
        person.calculateAge("12/02/2000");*/

        Student student = new Student();
        student.validateStudent(1,"robin");


        List<Integer> list = new ArrayList<>();
        list.add(23);
    }
}
