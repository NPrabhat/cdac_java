/*
WAP to interchange the values of two variables with using third variable.
*/

import java.util.Scanner;

class Swap{
    void swap(int a,int b){
        int c;
        System.out.println("Before swapping "+a+" "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping " + a+ " "+b);
    }
}
public class WAP7 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        Swap swa = new Swap();
        swa.swap(a,b);
    }
}
