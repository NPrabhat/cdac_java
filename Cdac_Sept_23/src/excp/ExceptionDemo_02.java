package excp;
public class ExceptionDemo_02 {
    public static void main(String[] args) {
        TestThrows tt = new TestThrows();
        tt.test();
        tt.display();
        try{
        tt.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
