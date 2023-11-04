/*
Q1. Write a Java program to create a new array list, add some colors
(string) and print out the collection.
Q2.Write a Java program to iterate through all elements in an array list.
Q3.Write a Java program to insert an element into the array list at the first
position.
Q4.Write a Java program to retrieve an element (at a specified index) from
a given array list.
Q5.Write a Java program to sort a given array list
Q6. Create a list of java defined wrapper classes and perform
insert/delete/search/iterate/sort operations..

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class Ques1and2 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        //ques 1
        lst.add("Red");
        lst.add("Blue");
        lst.add("Green");
        lst.add("Yellow");
        
        //ques 2
        Iterator it = lst.iterator();
        while(it.hasNext()){
            Object s = it.next();
            System.out.println(s);
        }
        System.out.println("*********************************");
        //ques 3
        
        lst.add(0, "Black");       
        
        Iterator it2 = lst.iterator();
        while(it2.hasNext()){
            Object s = it2.next();
            System.out.println(s);
        }
        
        //ques 4
        System.out.println(lst.get(1));
        
        //ques 5
        Collections.sort(lst);
        System.out.println(lst);
        
        //ques 6
        System.out.println("Ques 6***********************************");
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(4);
        list4.add(6);
        list4.add(3);
        list4.add(2);
        
        list4.remove(Integer.valueOf(2));
        list4.remove(Integer.valueOf(2));
        
        System.out.println(list4.indexOf(3));
        
        Iterator<Integer> it1 = list4.iterator();
        while(it1.hasNext()){
            Integer i = it1.next();
            System.out.println(i);
        }
        
        Collections.sort(list4);
        System.out.println(list4);
    }
}
