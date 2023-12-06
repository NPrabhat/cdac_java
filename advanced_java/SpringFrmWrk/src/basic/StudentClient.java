package basic;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class StudentClient {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic/spring.xml");
        Student s=(Student)ctx.getBean("stud");
        System.out.println(s);
    }
}