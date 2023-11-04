import java.util.Scanner;

/*
 WAP to calculate area of rectangle. (a_rec=l*b).
*/
public class WAP4 {
    public static void main(String[] args) {
        int l,b, ar;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();

        ar = l*b;
        System.out.println(ar);
    }
}
