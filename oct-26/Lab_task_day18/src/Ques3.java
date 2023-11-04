
import java.util.Vector;

/*
Q3. Write a java program to find a name from a collection.
*/
public class Ques3 {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
        
        
        v.add("Shashank");
        v.add("Harshal");
        v.add("Milind");
        v.add("Saurabh");
        
        System.out.println(v.contains("Harshal"));
    }
}
