package excp;
public class TestThrows {
    int a =10;
    int b=0;
    
    void show()throws Exception{
        System.out.println(a/b);
        Class.forName("sdfe");
    }
    
    void display(){
        System.out.println("Display");
    }
    
    void test(){
        System.out.println("Test");
    }
}
