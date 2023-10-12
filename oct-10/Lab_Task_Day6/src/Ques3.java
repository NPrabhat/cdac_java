
class Bank{
    public int getBalance(){
        return 0;
    }
}

class BankA extends Bank{
    @Override
    public int getBalance(){
        int a= 10000;
        return a;
    }
}


class BankB extends Bank{
    @Override
    public int getBalance(){
        int b= 15000;
        return b;
    }
}


class BankC extends Bank{
    @Override
    public int getBalance(){
        int c= 20000;
        return c;
    }
}


public class Ques3 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c= new BankC();
        
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println(c.getBalance());
        
    }
}
