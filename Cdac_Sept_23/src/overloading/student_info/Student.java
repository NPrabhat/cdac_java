package overloading.student_info;

import java.util.Scanner;

public class Student{
    String name;
    char grade;
    int rollNo,age;
    
    public Student(){
        name = "null";
        grade = 'A';
        age =0;
        rollNo = 0;
    }
    
    public Student(String name,int rollNo,int age,char grade){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.grade = grade;
    }
    
    void displayStudentInfo(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.displayStudentInfo();
        
        
        String name = sc.nextLine();
        int rollNo = sc.nextInt();
        int age = sc.nextInt();
        char grade = sc.next().charAt(0);
        Student s1 = new Student(name,rollNo,age,grade);
        s1.displayStudentInfo();
        
    }
}
