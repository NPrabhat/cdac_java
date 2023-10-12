package abstraction;

public interface StudentInter {
    int a=10; //public static final int a=10 ye lihka hua hai. In other words its constant

    void showName(String name);// public abstract void show();
    void showAge(int age);
     
    default void course(){
        System.out.println("Default method of interface");
        System.out.println("private non-static method "+exam());
    }
    
    static void institute(){
        System.out.println("This static methof of interface "+ city());
    }
    
    private String exam(){
        return "CET";
    }
    
    private static String city(){
        return "Nagpur";
    }
}
