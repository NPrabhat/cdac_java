import java.util.Scanner;
/*
2. Write a program in java to create a class name studinfo accept the student
information by the member method getdata and inherit it in the base class name marks create
method to get marks in derived class and calculate the percentage and display the complete
information of student do this for three students.
*/

class StudentInfo{
    String name;
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
}

class Marks extends StudentInfo{
    int marks1,marks2,marks3,marks4,marks5;
    float percentage;
    void getMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 5 subjects: ");
        this.marks1 = sc.nextInt();
        this.marks2 = sc.nextInt();
        this.marks3 = sc.nextInt();
        this.marks4 = sc.nextInt();
        this.marks5 = sc.nextInt();
        
    }
    
    float calculatePercentage(){
        percentage = (((float)marks1+(float)marks2+(float)marks3+(float)marks4+(float)marks5)/500)*100;
        return percentage;
    }
    
    void displayInfo(){
        System.out.println("The information of student is ");
        System.out.println("Name: "+name);
        System.out.println("Marks 1: " +marks1+" Marks 2: "+marks2+" Marks 3: "+marks3+" Marks 4: "+marks4+" Marks 5: "+marks5);
        System.out.println("Percentage: "+calculatePercentage());
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        Marks m2 = new Marks();
        Marks m3 = new Marks();
        
        m1.getData();
        m1.getMarks();
        m1.displayInfo();
        
        m2.getData();
        m2.getMarks();
        m2.displayInfo();
        
        m3.getData();
        m3.getMarks();
        m3.displayInfo();
    }
}
