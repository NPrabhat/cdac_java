package inner.nonstat;

class Outer{
    int x=10;
    class Inner{
        int y=200;
        void display(){
            System.out.println("I'm non static inner class");
        }
    }
}

public class TestNonStaticInnerCls {
    public static void main(String[] args) {
        Outer o= new Outer();
        Outer.Inner obj = o.new Inner();
    }
}
