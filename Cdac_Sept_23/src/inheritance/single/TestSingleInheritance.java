//Date: 09/10/2023
//Here we have used Single level inheritance and multilevel inheritance
package inheritance.single;

class GrandParent{
    int x=100;
    void test(){
        System.out.println("x= "+x);
    }
}

class Parent extends GrandParent{
    int a=10;
    void show(){
        System.out.println("a= "+a);
    }
}

class Child extends Parent{
    int b=20;
    void display(){
        System.out.println("b= "+b);
    }
}

public class TestSingleInheritance{
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.show();
        Child c = new Child();
        c.show();
        c.display();
        c.test();
    }
}