import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;
import java.util.Vector;

/*
Q1. .Write a java program to Create a collection of Employee class and sort
objects using comparable and comparator interfaces.
 */
class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    
    public Employee(int id,String name){
        this.id = id;
        this.name = name;   
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
}

class EmployeeSortingByName implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
        
        
public class Ques1 {

    public static void main(String[] args) {
        Vector<Employee> v = new Vector<>();
        
        Employee e1 = new Employee(101,"Shashank");
        Employee e2 = new Employee(102,"Harshal");
        Employee e3 = new Employee(105,"Milind");
        Employee e4 = new Employee(104,"Saurabh");
        
        v.add(e1);
        v.add(e2);
        v.add(e3);
        v.add(e4);
        

        EmployeeSortingByName emp = new EmployeeSortingByName();
        
        Collections.sort(v,emp);
        System.out.println(v);
        
    }
}
