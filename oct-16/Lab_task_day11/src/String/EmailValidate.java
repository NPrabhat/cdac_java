/*
2.Create a program to validate if a string represents a valid email address.
*/

package String;

import java.util.Scanner;

public class EmailValidate {

    static boolean contain(String email){
        if(email.contains("@") && email.contains(".")){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        
        if(contain(email)==true){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
        
    }
}
