package general;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Testjoining {
    public static void main(String[] args) {
         AnnotationConfiguration config = new AnnotationConfiguration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction tc = s.beginTransaction();
       
    }
}
