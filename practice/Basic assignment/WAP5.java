import java.util.Scanner;
/*
5. WAP to calculate area of circle (a cir=pi*r*r)
*/
public class WAP5 {
    public static final float pi = 3.14f;
    static float area_of_circle(float radius){
        return pi*radius*radius;
    }
    public static void main(String[] args) {
        float radius;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextFloat();
        System.out.println(area_of_circle(radius));
    }
}
