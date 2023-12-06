package mapping.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestOneToOne {
    public static void main(String[] args) {
        AnnotationConfiguration config = new AnnotationConfiguration();
//        config.addAnnotatedClass("Student.class");
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction tc = s.beginTransaction();
        
        
        Person p =new Person();
        p.setpId(101);
        p.setpName("Ramesh");
        
        PersonDetail pd = new PersonDetail();
        pd.setdId(11);
        pd.setPhNo(9988776655L);
        pd.setCity("Rampur");
        pd.setEmail("ram@gmail.com");
        
        
        
        s.save(p);//create a bathc file 
        s.save(pd);//create a bathc file 
        tc.commit();//data changes 
        s.close();
    }
}
