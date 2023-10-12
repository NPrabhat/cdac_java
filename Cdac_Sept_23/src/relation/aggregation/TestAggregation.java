//Date- 09/10/2023
package relation.aggregation;

class College{
    private String name;
    private Department departs[] = new Department[5];
    
    public College(String name, Department[] departs){
        this.name = name;
        this.departs = departs;
    }
    
    void collegeDetails(){
        System.out.println("College Details:");
        System.out.println("Name:" + name);
        System.out.println("department: "+ departs);
    }
}

class Department{
    private String name;
    private int capacity;

    public Department(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
    void 
    
}

public class TestAggregation {
    public static void main(String[] args) {
        College c[] = new College("YCCE", (new Department("IT",500)));
    }
}
