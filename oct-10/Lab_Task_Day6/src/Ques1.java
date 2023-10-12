import java.lang.*;

class A{
    protected void output(){
        System.out.println("Hello");
    }
}

class B extends A{
    @Override 
    public void output(){
        System.out.println("Hola");
    }
}

public class Ques1 extends A{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        
        a.output();
        b.output();
    }    
}
