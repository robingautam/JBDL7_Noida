package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndNonFailFast {

    public static void main(String[] args) {
    /*    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(1);
        arrayList.add(3);

        Iterator<Integer> itr = arrayList.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            arrayList.remove(arrayList.size()-1);
        }*/

        List<Integer> cora = new CopyOnWriteArrayList<>();
        cora.add(23);
        cora.add(2);

        Iterator<Integer> itr = cora.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
            cora.remove(cora.size()-1);
        }
    }
}
