package lab_task_day16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
/*
Q.1.Formatting Dates to Strings:
a. Create a SimpleDateFormat object to format the current date in the "dd-MM-yyyy"
pattern. Print the formatted date.
b. Format the current time in the "HH:mm:ss" pattern and display it.
c. Create a SimpleDateFormat object to format a given date of your choice in the "MMM dd,
yyyy" pattern.

*/      
        //(a)
        Date d = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        String strdate  = sdf1.format(d);
        System.out.println(strdate);
        
        //(b)
        Date d1 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String strTime = sdf2.format(d1);
        System.out.println(strTime);
        
        //(c)
        Date d2 = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("MMM dd yyyy");
        String strMonth = sdf3.format(d2);
        System.out.println(strMonth);
        
    }
}
