package lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class LifeCycleDemo {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("setter");
        this.x = x;
    }
    
    @PostConstruct
    public void start(){
        System.out.println("INIT Method Invoked");
    }
    
    @PreDestroy
    public void stop(){
        System.out.println("Destroy Method Invoked");
    }   
}
