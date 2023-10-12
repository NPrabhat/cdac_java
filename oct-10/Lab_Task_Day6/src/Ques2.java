
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
public class Ques2 {
    public static void main(String[] args) {
        A a = new B();
        a.output();
    }
}
