import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    String sName;
    int prnNo;
}

class Trainer extends Student{
    String tName;
}

class Assignment extends Trainer{
    String  title;
    LocalDate date;
    String description;
    String assignee;
    Scanner sc = new Scanner(System.in);

    Assignment(){
        //user assigning
        System.out.print("Enter student's name: ");
        super.sName = sc.next();
        System.out.print("\nEnter student's prn No. ");
        super.prnNo = sc.nextInt();
        System.out.print("\nEnter trainer's name: ");
        super.tName = sc.next();
        System.out.print("\nEnter title: ");
        this.title = sc.next();
        System.out.print("\nEnter description: ");
        this.description = sc.next();
        
        //self assigning
        this.date = LocalDate.now();
        this.assignee = super.sName;   
    }
    
    
    //Showing all feilds
    public void showAssignment(){
        System.out.println("Showing details:\n"+
                super.sName+ "\n"+
                super.prnNo+"\n"+
                super.tName+"\n"+
                this.title+"\n"+
                this.description+"\n"+
                this.date+"\nAssigned to:"+
                this.assignee);
    }
    
    //check assignment on basis of date
    public void checkAssignment(String date1){
       if(date.toString().equals(date1)){
           showAssignment();
       }
    }
}
        
public class AssignmentManager {    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Initialize Objects
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();
        Assignment assignment3 = new Assignment();
        
        
        
        //Add object to collection
        List<Assignment> listAssignment = new ArrayList<>();
        listAssignment.add(assignment1);
        listAssignment.add(assignment2);
        listAssignment.add(assignment3);
        
        //showing objects        
        listAssignment.get(0).showAssignment();
        listAssignment.get(1).showAssignment();
        listAssignment.get(2).showAssignment();

        //checking assignment form date
        System.out.println("**************************************************");
        System.out.println("Enter date in yyyy-MM-dd format");
        String checkDate = scan.next();
        listAssignment.get(0).checkAssignment(checkDate);
    }
}
