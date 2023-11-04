package generic;

class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void showInfo(){
        System.out.println("Hello "+name+", your age is "+age);
    }
}

public class TestReflectionApi {
    public static void main(String[] args) {
        //create class reference 
        Class personCls = Person.class;
    }
}
