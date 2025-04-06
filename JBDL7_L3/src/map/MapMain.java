package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();
        Student s1 = new Student(1,"Robin","robin@gmail.com");
        Student s2 = new Student(1,"Robin","robin@gmail.com");
        Student s3 = new Student(2,"sagar","sagar@gmail.com");


        map.put(s1,s1.name);
        map.put(s2,s2.name);
        map.put(s3,s3.name);

     //   System.out.println(map.size());


        CustomHashMap<Integer,String> customHashMap = new CustomHashMap();
        customHashMap.put(1,"Robin");
        customHashMap.put(2,"Sagar");

        System.out.println(customHashMap.get(3));


    }
}
