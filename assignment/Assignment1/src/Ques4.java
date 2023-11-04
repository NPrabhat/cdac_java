import java.util.Scanner;
/*
4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
class and implement the respective methods to calculate the area and perimeter of each shape.
*/
abstract class GeometricShape{
    abstract float area();
    abstract float perimeter();
    void set(){}
}

class Triangle extends GeometricShape{
    int sideA, sideB, sideC;
    int base, height;
    float areaOfT, periOfT;
    @Override 
    float area(){
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        height = sc.nextInt();
        areaOfT = (base*height)/2;
        return areaOfT;
    }
    
    float perimeter(){
        Scanner sc = new Scanner(System.in);
        sideA = sc.nextInt();
        sideB = sc.nextInt();
        sideC = sc.nextInt();
        periOfT = sideA + sideB + sideC;        
        return periOfT;
    }
}

class Rectangle extends GeometricShape{
    int length, width;
    float areaOfR, periOfR;
    @Override
    void set(){
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        width = sc.nextInt();
    }
    float area(){
        areaOfR = length*width;
        return areaOfR;
    }
    float perimeter(){
        periOfR = 2*(length+width);
        return periOfR;
    }
}

public class Ques4 {
    public static void main(String[] args) {
        Triangle g1 = new Triangle();
        Rectangle g2 = new Rectangle();
        
        System.out.println(g1.area());
        System.out.println(g1.perimeter());
        
        g2.set();
        System.out.println(g2.area());
        System.out.println(g2.perimeter());
    }
}
