/*
6.Write a java program to create a demo application to understand the role of access modifiers.
*/
class Employee {
    public String name;
    private int age;
    protected String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

class Programmer extends Employee{
     public Programmer(String name, int age, String designation) {
        super(name, age, designation);
    }

    public void printProgrammerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
        System.out.println("Designation: " + designation);
    }
}
        
public class Ques6{
    public static void main(String[] args){
        Employee emp = new Employee("Rikshit", 22, "Analyst");
        emp.printDetails();

        Programmer prog = new Programmer("Ankit", 23, "Senior Software Engineer");
        prog.printProgrammerDetails();
    }
}
