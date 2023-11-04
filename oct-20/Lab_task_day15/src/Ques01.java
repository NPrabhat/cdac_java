/*
1.Write a Java code to create a BufferedReader and read a line of text from the output
screen.
*/
import java.io.*;
public class Ques01 {
    
    void readLines()throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide Input below");
        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));
    }
    public static void main(String[] args)throws IOException {
        Ques01 q = new Ques01();
        q.readLines();
    }
}
