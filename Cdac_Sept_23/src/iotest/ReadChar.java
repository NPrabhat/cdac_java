package iotest;

import java.io.*;

public class ReadChar {
    void readCharacters()throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Provide sentence to read its characeter.");
        
        do{
            c = (char)br.read();
            System.out.println(c);
        }       
        while(c!='q');
    }
    public static void main(String[] args) throws IOException {
        ReadChar rc = new ReadChar();
        rc.readCharacters();
    }
}
