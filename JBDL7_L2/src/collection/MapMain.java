package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {
        /*Map<Integer,String> map = new HashMap<>();
        map.put(1,"Robin");
        map.put(2,"sagar");

        System.out.println(map);

        for (int key: map.keySet()){
            System.out.println(map.get(key));
        }

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println(map.containsKey(7));

        System.out.println(map.getOrDefault(10,"0"));*/

      /*  Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"robin");
        linkedHashMap.put(9,"sagar");

        System.out.println(linkedHashMap);*/

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"robin");
        treeMap.put(2,"sagar");
        treeMap.put(3,"aakash");
        treeMap.put(4,"preeti");
        treeMap.put(30,"hi");
        System.out.println(treeMap.floorKey(25));
        System.out.println(treeMap.ceilingKey(25));



    }
}
