package thread.synchronization.bank;

public class Customer implements Runnable{
    private String name;
    private Account account;
    
    public Customer(String name,Account account){
        this.name =name;
        this.account = account;
    }
    
    @Override
    public void run(){
        System.out.println("Enter amount to withdraw");
    }
}
