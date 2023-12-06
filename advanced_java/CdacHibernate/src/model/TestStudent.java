package model;
public class TestStudent {
    public static void main(String[] args) {
        AnnotationConfiguration config =  new AnnotationConfiguration();
//        config.addAnnotatedClass(Student.class);  //used for mapping in xml if it is not present there
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tc = s.beginTransaction();
        
        
        Student stud = new Student();
        stud.setId(101);
        stud.setName("Ramesh");
        stud.setEmail("ramesh@gmail.com");
        stud.setCity("Rampur");
        
        s.save(stud); //create a batch file
        tc.commit(); //data changes
        s.close();  //close the connection
        
    }
}
