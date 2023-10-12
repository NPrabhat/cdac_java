package inheritance.overriding;


class Animal{
    void animalSound(){
        System.out.println("Generic Animal Sound: ");
    }
}

class Dog extends Animal{
    void animalSound(){
        System.out.println("Dog Barks...");
    }
}

class Cat extends Animal{
    void animalSound(){
        System.out.println("Cat Meows...");
    }
}

public class TestOverriding {
    public static void main(String args[]){
//        Dog d = new Dog();
//        d.animalSound();
//        
//        Cat c= new Cat();
//        c.animalSound();

        Animal a = new Dog();
        a.animalSound();
    }
}
