package map;

import java.util.LinkedList;

public class CustomHashMap<K,V> {

    LinkedList<Node>[] bucket = new LinkedList[16];

    public CustomHashMap(){
        for (int i=0;i<bucket.length;i++){
            bucket[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value){
        int bucketIndex = hashFunction(key);
        bucket[bucketIndex].add(new Node(key,value));
    }


    public V get(K key){
        int bucketIndex = hashFunction(key);
        LinkedList<Node> list = bucket[bucketIndex];
        if (list.size()==0){
            return (V) "Data Not Found";
        }
        for (int i=0;i<list.size();i++){
            Node node = list.get(i);
            if (node.key.equals(key)){
                return (V) node.value;
            }
        }
        return (V) "Data Not Found";
    }


    public int hashFunction(K key){
        int hashcode = key.hashCode();
        return Math.abs(hashcode% bucket.length);
    }
}
