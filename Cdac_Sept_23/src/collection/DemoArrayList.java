package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List lst = new ArrayList();
        List lst1 = new ArrayList();
        
//        lst1.add('1');
//        lst1.add('1');
//        lst1.add('1');
//        lst1.add('1');
//        lst1.add('1');
//        
//        lst.add("D");
//        lst.add("A");
//        lst.add("B");
//        lst.add("D");
//        lst.add(3, 'C');
//        lst.remove(1);
//        
        
        lst.add(23);
        lst.add(12.23);
        lst.add("Soft Polynomials");
        lst.add(new Date());
        
        for(Object o: lst){
            System.out.println(o);
        }
        
        System.out.println("now Using Iterator***************************");
        Iterator it = lst.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }        
    }
}
