import java.util.Scanner;
/*
WAP to interchange the values of two variables without using third variable
*/
class SwapWithoutThird{
    void Swap(int a,int b){
        System.out.println("Before swapping " + a +" "+b);
        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println("After swapping " + a +" "+b);
    }
}
public class WAP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapWithoutThird s = new SwapWithoutThird();
        int a,b;
        a= sc.nextInt();
        b= sc.nextInt();

        s.Swap(a,b);
    }
}
