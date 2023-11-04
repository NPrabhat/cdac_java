
import java.util.Scanner;

/*
Q2. Create a user-defined exception class NegativeValueException that extends
Exception. Write a Java program that takes an integer as input and throws a
NegativeValueException if the input is a negative number.
*/

class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}
class NegativeNos{
    void checkNegative(int x){
        if(x>0){
            System.out.println("Valid number");
        }
        else{
            try{
                throw new NegativeValueException("You entered a negative number");
            }
            catch(NegativeValueException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NegativeNos n = new NegativeNos();
        int num = sc.nextInt();
        n.checkNegative(num);
    }
}
