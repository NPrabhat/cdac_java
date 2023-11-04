package iotest;
import java.io.*;
public class ReadAndCopyFile {
    void copyFile(){
        int i;
        try(FileInputStream fin = new FileInputStream("C:\\Users\\delll\\OneDrive\\Desktop\\unsplash.jpg")){
            FileOutputStream fout = new FileOutputStream("D:\\cdac_java\\oct-20\\haclerrank.png");
            do{
                i = fin.read();
                fout.write(i);
            }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        ReadAndCopyFile cf = new ReadAndCopyFile();
        cf.copyFile();
    }
}
