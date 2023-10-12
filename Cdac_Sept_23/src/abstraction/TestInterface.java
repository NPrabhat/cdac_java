package abstraction;
public class TestInterface {
    public static void main(String[] args) {
        StudentInter si;
        si=new StudentImp();
        si.showAge(23);
        si.showName("Ramesh");
        si.course();
        StudentInter.institute();
    }
}
