import java.util.Scanner;
/*.
 WAP to calculate simple interest. (si=p*n*r)/100
*/
public class WAP3 {
    public static void main(String[] args) {
        float si,r;
        int p,n;
        Scanner sc = new Scanner(System.in);
        p= sc.nextInt();
        n = sc.nextInt();
        r = sc.nextFloat();
        si = (p*n*r)/100;
        System.out.println(si);
    }
}

