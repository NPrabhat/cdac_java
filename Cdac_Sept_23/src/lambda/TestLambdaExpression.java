package lambda;

@FunctionalInterface
interface LengthFinder{
    int strLength(String str);
}

public class TestLambdaExpression {
    public static void main(String[] args) {
        LengthFinder lf = (str)->str.length();
        System.out.println("Length is "+ lf.strLength("Prabaht"));
        
        //Anonymous class
        Runnable r1 = new Runnable();
        @Override 
        public void run(){
        for(int i=0;)
    }
    }
}
