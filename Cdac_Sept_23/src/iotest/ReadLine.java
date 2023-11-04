package iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine{
    void readLines() throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentence to read its characeter.");
        do{
            str = br.readLine();
            System.out.println(str);
        }       
        while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException{
        ReadLine rc = new ReadLine();
        rc.readLines();
    }
}
