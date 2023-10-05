package pattern;

import java.util.Scanner;

public class HollowTriangleAlphabet{
    void equilateralTriangle(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                if(k == 1 || i == 5 || k == (2 * i - 1) || i==5 || i==10){ 
                    System.out.print("*"); 
                } 
                else{ 
                    System.out.print(" "); 
                } 
            } 
            System.out.println("");
        }
    }
    void dynamicEquilateralTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of pattern: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.err.print(" ");
            }
            for(int j=0;j<i;j++){
                System.err.print("* ");
            }
            System.err.println("");
        }
    }
    public static void main(String[] args) {
        HollowTriangle t= new HollowTriangle();
        t.equilateralTriangle();
//          t.dynamicEquilateralTriangle();
    }
}
