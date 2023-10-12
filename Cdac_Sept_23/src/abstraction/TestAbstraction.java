package abstraction;

import java.util.Scanner;

abstract class LivingThing{
    void eyes(){
        System.out.println("Two eyes");
    }
    void mouth(){
        System.out.println("One mouth");
    }
    abstract void legs();
}

class Human extends LivingThing{
    @Override
    public void legs(){
        System.out.println("Two legs");
    }
}

class Animal extends LivingThing{
    @Override
    public void legs(){
        System.out.println("Four legs");
    }
}

public class TestAbstraction {
    
    static void showProperty(){
        
    } 
    
    public static void main(String[] args) {
        LivingThing lt;
        System.out.println("Property of human ");
        lt = new Human();
        lt.eyes();
        lt.mouth();
        lt.legs();
        System.out.println("Property of Animal ");
        lt = new Animal();
        lt.eyes();
        lt.mouth();
        lt.legs();
        
        
        System.out.println("Whose property you want to know");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if(choice.equals("Human")){
            System.out.println("Property of human ");
        }
    }
}
