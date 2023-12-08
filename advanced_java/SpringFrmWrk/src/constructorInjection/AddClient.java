package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("constructorInjection/spring.xml");   
        Addition dd= ctx.getBean("add",Addition.class);
        System.out.println(dd);   
    }
}