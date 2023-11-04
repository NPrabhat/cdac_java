/*
.Write a Java program to demonstrate Upcasting Vs Downcasting.
*/

class Sports{
    void displayName(){
        System.out.println("Sports");
    }
}

class Cricket extends Sports{
    void displayName(){
        System.out.println("Cricket");
    }
}

class Football extends Sports{
    void displayName(){
        System.out.println("Football");
    }
}

public class Ques5 {
    public static void main(String[] args) {
        //upcasting
        Sports s1 = new Cricket();
        s1.displayName();
        Sports s2 = new Football();
        s2.displayName();
        
        //downcasting
        Sports s3 = new Cricket();
        Cricket cricket = (Cricket) s3;
        Sports s4 = new Football();
        Football football = (Football) s4;
        cricket.displayName();
        football.displayName();
        
    }
}
