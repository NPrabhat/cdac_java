package iotest;

import java.io.FileInputStream;

public class ReadFile {
    void ReadFile(){
        int i;
        //try with resource
        try(FileInputStream fin = new FileInputStream("D:\\cdac_java\\oct-03\\Demo1.java")){
            do{
                i=fin.read();
                System.out.println((char)i);
            }
            while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ReadFile rf = new ReadFile();
        rf.ReadFile();
    }
}
