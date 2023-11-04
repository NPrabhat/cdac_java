/*
1.Build a class which has references to other classes. Instantiate these reference variables and
invoke instance methods.
*/
class Object1{
    void method1(){
        System.out.println("Object1 has been called.");
    }
}

class Object2{
    void method2(){
        System.out.println("Object2 has been called.");
    }
}

public class Ques1 {
    
    private Object1 obj1;
    private Object2 obj2;
    
    Ques1(){
        obj1 = new Object1();
        obj2 = new Object2();
    }
    
    void callMethod(){
        obj1.method1();
        obj2.method2();
    }
    public static void main(String[] args) {
         Ques1 q1 = new Ques1();
         q1.callMethod();
    }
}
