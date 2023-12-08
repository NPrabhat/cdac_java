package CollectionInjection;

import collectionInjection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpClient {
    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("CollectionInjection/spring.xml");
        Employee e=ctx.getBean("emp",Employee.class);
//Employee e=(Employee)ctx.getBean("emp");
        System.err.println(e);
    }
}
