package lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("lifeCycle/spring.xml");
        ctx.registerShutdownHook(); //for executing destroy method
        LifeCycleDemo ld = (LifeCycleDemo)ctx.getBean("life",LifeCycleDemo.class);
        System.out.println(ld.getX());
    }
}
