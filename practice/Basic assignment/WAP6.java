import java.util.Scanner;
/*
WAP to calculate multiplication of three numbers.
 */
public class WAP6 {
    static float multiply_3_nos(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(multiply_3_nos(a,b,c));
    }
}
