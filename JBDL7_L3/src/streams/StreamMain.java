package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(10);
        list.add(23);
        list.add(8);

      /*  List<Integer> ans = new ArrayList<>();
        //
        for (int i=0;i<list.size();i++){
            int val = list.get(i);
            if (val%2==0){
                ans.add(val);
            }
        }

        System.out.println(ans);*/


        // List<Integer> ans2 =  list.stream().filter((i)->i%2==0).map(i->i*i).sorted().limit(0).collect(Collectors.toList());

        //  System.out.println(ans2);

       /*List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);*

        */

        /*List<Integer> ans = list.stream().distinct().skip(2).collect(Collectors.toList());
        System.out.println(ans);*/

    /*   int ans = list.stream().min((i1,i2)->i1-i2).get();
        System.out.println(ans);*/

      //  System.out.println(list.stream().anyMatch(i->i<0));

        //System.out.println(list.stream().allMatch(i->i%2==0));

        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Robin","robin@gmail.,com",25000));
        employees.add(new Employee("Aakash","aakash@gmail.com",20000));

        System.out.println(employees.stream().sorted().collect(Collectors.toList()));


    }
}
