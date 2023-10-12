/*
Create an array of employee class and initialize array elements with different employee objects.
*/

class Employee{
    String name;
    int id;
    Employee(String name,int id){
        this.name = name;
        this.id = id;
    }
}

public class Ques1 {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        e[0] = new Employee("Prabhat",1);
        e[1] = new Employee("Shashank",2);
        e[2] = new Employee("Harshal",3);
        
        for(int i=0;i<3;i++){
            System.out.println(e[i].name+" "+e[i].id);
        }
    }
}
