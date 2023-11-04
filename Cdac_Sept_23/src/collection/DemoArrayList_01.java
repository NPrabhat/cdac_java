package collection;
import java.util.*;

public class DemoArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);
        
        
//        System.out.println(lst);
        System.out.println(lst.get(2)+5);

        for(Integer i:lst){
            System.out.println(i+5);
        }
        
        Collections.sort(lst);
//        int pos = Collections.binarySearch(lst, 20);
//        System.out.println(pos);

        
        
        
    }
}
