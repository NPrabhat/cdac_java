/*
3.Write a Java program to create an abstract class Instrument with abstract methods play() and
tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
the respective methods to play and tune each instrument.
*/

abstract class Instrument{
    abstract void play();
    abstract void tune();
}

class Piano extends Instrument{
    @Override
    void play(){
        System.out.println("Playing Piano");
    }
    @Override
    void tune(){
        System.out.println("Tuning Piano");
    }
}
class Guitar extends Instrument{
    @Override
    void play(){
        System.out.println("Playing Piano");
    }
    @Override
    void tune(){
        System.out.println("Tuning Piano");
    }    
}

public class Ques3{
    public static void main(String[] args) {
        Instrument ln = new Piano();
        Instrument ln1 = new Guitar();
        
        ln.play();
        ln.tune();
        
        ln1.play();
        ln1.tune();
    }    
}
