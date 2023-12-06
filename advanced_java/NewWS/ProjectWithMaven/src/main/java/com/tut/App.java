package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating Student
        Student st = new Student();
        st.setId(102);
        st.setName("Suresh");
        st.setEmail("suresh@gmail.com");
        st.setCity("Sitapur");
        System.out.println(st);
        
        
        //creating object of address
        Address ad = new Address();
        ad.setStreet("street1 ");
        ad.setCity("Sitapur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.456);
        
        //Reading image
        FileInputStream fis = new FileInputStream("src/main/java/un.png");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        
        Transaction tc =  session.beginTransaction();        
        session.save(st);   
        session.save(ad);
        tc.commit();        
        session.close();
        System.out.println("Done...");
        
    }
}







