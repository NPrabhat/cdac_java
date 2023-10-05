package pattern;

import java.util.Scanner;

public class TrianglePattern{
    void equilateralTriangle(){
        for(int i=0;i<5;i++){
            for(int j=4;j>i;j--){
                System.err.print(" ");
            }
            for(int j=0;j<i;j++){
                System.err.print("* ");
            }
            System.err.println("");
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
        TrianglePattern t= new TrianglePattern();
        t.equilateralTriangle();
//          t.dynamicEquilateralTriangle();
    }
}
