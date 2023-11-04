package excp;

public class ExceptionDemo_01 {
    int a=10;
    int b=2;
    int arr[]={1,2,3};
    void display(){
        System.out.println("Display");
    }
    void show(){
        System.out.println("C");
        try{
            System.out.println(a/b);
            arr[5]=12;
            System.out.println("D");
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("D");
        }        
    }
    public static void main(String[] args) {
        System.out.println("A");
        ExceptionDemo_01 obj = new ExceptionDemo_01();
        System.out.println("B");
        obj.show();
        System.out.println("E");
        obj.display();
    }
}
