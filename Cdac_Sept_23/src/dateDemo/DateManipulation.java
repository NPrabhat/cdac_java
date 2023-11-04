package dateDemo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManipulation {
    public static void main(String[] args) {
        Date d = new Date();
        
        //for converting date to string
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
//        String strDate = sdf.format(d);
//        System.out.println(strDate);
            
        String sDate = "2021-10-23";
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
            Date dt = sdf.parse(sDate);
            System.out.println(dt);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
                

    }
}
