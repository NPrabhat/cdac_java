package excp;
import java.util.Scanner;

public class VoterValidation {
    void checkValidity(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter age : ");
        int a= sc.nextInt();
        
        if(a>=18){
            System.out.println("Congrats you are eligible for making voter ID");
        }
        else{
            try{
                throw new InvalidEntryException("Wait till you are 18");
            }
            catch(InvalidEntryException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
