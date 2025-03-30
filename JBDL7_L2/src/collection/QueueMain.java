package collection;

import javax.swing.table.TableStringConverter;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueMain {

    public static void main(String[] args) {
        /*Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.remove());*/

       /* Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while (queue.size()>0){
            System.out.println(queue.remove());
        }*/

       /* Queue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(3,"Preeti","aakash@gmail.com"));
        pq.add(new Student(1,"Robin","robin@gmail.com"));
        pq.add(new Student(2,"Aakash","aakash@gmail.com"));


        while (pq.size()>0){
            System.out.println(pq.remove());
        }*/

        Queue<Integer> abq = new ArrayBlockingQueue<>(4);
        abq.add(23); abq.add(12); abq.add(10); abq.add(1); abq.offer(34);

        System.out.println(abq);

     /*   Queue<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.add(23);

        System.out.println(dq);*/




    }
}
