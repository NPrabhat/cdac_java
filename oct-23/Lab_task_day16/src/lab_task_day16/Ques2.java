package lab_task_day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

/*
Q2.Parsing Strings into Dates:
a. Create a SimpleDateFormat object to parse a date string in the "yyyy-MM-dd" format. Parse
the string "2023-10-23" and print the Date object.
b. Parse a date string in the "dd/MM/yyyy" format from user input and print the parsed Date
object. Handle any potential ParseException.
*/

public class Ques2 {
    public static void main(String[] args) throws ParseException{
        //(a)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = sdf.parse("2023-10-23");
        System.out.println(parsedDate);      
        
        
        //(b)
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy");
        String arr[] = date.split("/");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        System.out.println(a+" "+b+" "+c);
        
        
    }
}
