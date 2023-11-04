package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StudentCollection {
    public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        
        Student s1 = new Student(101,"Ramesh",23);
        Student s2 = new Student(102,"Bhavesh",28);
        Student s3 = new Student(105,"Mahesh",25);
        Student s4 = new Student(104,"Dinesh",21);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
        
        Collections.sort(v);
//        StudentSortingByName ssbn = new StudentSortingByName();
            StudentSortingByAge ssba = new StudentSortingByAge();
//         Collections.sort(v,ssbn);
            Collections.sort(v,ssba);
        
//        System.out.println(v.get(1));
        
        Iterator<Student> it = v.iterator();
        while (it.hasNext()) {
            Student next = it.next();
            System.out.println(next.getId()+" "+next.getName()+" "+next.getAge());
        }}}
//        }}
//        System.out.println("Stack************************************************");
//        
//        Stack<Student> s = new Stack<>();
//        
//        Student s5 = new Student("Sohail",21);
//        Student s6 = new Student("Sohail",22);
//        Student s7 = new Student("Sohail",23);
//        Student s8 = new Student("Sohail",24);
//        
//        s.push(s5);
//        s.push(s6);
//        s.push(s7);
//        s.push(s8);
//        
//        System.out.println(s.peek());
//        
//        Iterator<Student> itt = s.iterator();
//        while (itt.hasNext()) {
//            Student next = itt.next();
//            System.out.println(next);
//        }
//        }        


