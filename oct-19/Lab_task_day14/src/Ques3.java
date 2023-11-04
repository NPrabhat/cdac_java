import java.util.Scanner;
/*
Q3. Create a user-defined exception class InsufficientFundException that extends
Exception. Write a Java program that simulates a bank account and throws an
InsufficientFundsException when trying to withdraw more money than the
account balance.
*/

class InsufficientFundException extends Exception{
    public InsufficientFundException(String msg){
        super(msg);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = 10000;
        int wd = sc.nextInt();
        
        if(wd<amount){
            System.out.println("Can be withdrawn");
        }
        else{
            try{
                throw new InsufficientFundException("You have insuffiecient balance");
            }
            catch(InsufficientFundException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
