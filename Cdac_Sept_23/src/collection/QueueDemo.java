
package collection;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        PriorityQueue<String> q = new PriorityQueue<>();
//        q.add("Ramesh");
//        q.add("Suresh");
//        q.add("Dinesh");
//        q.add("Bhavesh");
//        q.add("Mahesh");
//       
//        System.out.println(q);
//        
//        q.poll();
//        System.out.println(q);
//        q.poll();
//        System.out.println(q);
//        q.poll();
//        System.out.println(q);
    
          Deque<String> d = new ArrayDeque<>();
          d.add("Milind");
          d.addFirst("Harshal");
          d.addLast("Saurabh");
          
          System.out.println(d);
    }
}
