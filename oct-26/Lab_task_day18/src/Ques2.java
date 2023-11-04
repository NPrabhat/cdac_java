
import java.util.Queue;
import java.util.LinkedList;
/*
Q2.Write a java program to Implement Queue data structure using
LinkedList and Queue collection.
*/
public class Ques2 {
    public static void main(String[] args) {
        Queue<Integer> q = new  LinkedList();
        
        q.add(23);
        q.add(33);
        q.add(43);
        q.add(53);
        
        System.out.println(q);
        
        
        
    }
}
