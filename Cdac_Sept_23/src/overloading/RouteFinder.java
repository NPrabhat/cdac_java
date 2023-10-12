package overloading;
import java.util.Scanner;
public class RouteFinder {
    void route(String src, String via, String dest){
        System.out.println("Moving from "+src + " to "+dest+" via "+via);
    }
    void route(String src, String dest){
        System.out.println("Moving from "+src+" to "+dest);
    }
    void route( String dest){
        System.out.println("Moving to "+dest);
    }
    public static void main(String[] args) {
        RouteFinder rf = new RouteFinder();
        
        System.out.println("Pleas Enter: ");
        System.out.println("1. For Destination only");
        System.out.println("2. For Source and Destination");
        System.out.println("3. For Source, via and Destination");
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice = sc1.nextInt();
        
        switch (choice) {
            case 1:{
                System.out.print("Enter source: ");
                String s= sc.nextLine();
                rf.route(s);      
                break;
            }         
            case 2:{
                System.out.print("Enter source and destination: ");
                String s= sc.nextLine();
                String d= sc.nextLine();
                rf.route(s, d);      
                break;
            }             
            case 3:{
                System.out.print("Enter source,via and destination: ");
                String s= sc.nextLine();
                String v= sc.nextLine();
                String d= sc.nextLine();
                rf.route(s, v, d);      
                break;
            }   
            default:
                throw new AssertionError();
        }        
    }
}