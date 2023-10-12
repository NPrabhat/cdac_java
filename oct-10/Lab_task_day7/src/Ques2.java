/*
2.Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises
*/

abstract class Person{
    public abstract void eat();
    public abstract void exercise();
}

class Athlete extends Person{
    @Override
    public void eat(){
        System.out.println("This athlete is eating healthy food.");
    }
    public void exercise(){
        System.out.println("This athelete is exercising");
    }
}
class LazyPerson extends Person{
    @Override
    public void eat(){
        System.out.println("This lazy person is eating chips and cold drinks");
    }
    public void exercise(){
        System.out.println("This lazy person is not Exercising");
    }
}
public class Ques2 {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        LazyPerson l = new LazyPerson();
        
        a.eat();
        a.exercise();
        
        l.eat();
        l.exercise();
    }
}
