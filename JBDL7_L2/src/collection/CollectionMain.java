package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(2);
        list.add(1,29);
        list.set(0,12);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1001);

        list.addAll(list2);

//        list.clear();
        System.out.println(list.isEmpty());
        list.remove(list.size()-1);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

      /*  Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/




    }
}
