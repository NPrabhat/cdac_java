
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.util.ArrayDeque;
import java.util.Deque;

/*
Q5. Write a java program to perform insertion at first and at last position in
Array Dequeue.
*/
public class Ques5 {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.addFirst(10);
        q.addFirst(50);
        
        int first = q.removeFirst();
        int last = q.removeLast();
        
        System.out.println("First :"+first+" "+"Last :"+last);
    }
}
