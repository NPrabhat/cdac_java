package thread.deadlock;

public class DeadLockDemo {
    public static void main(String[] args) {
        String rec1 = "Aman";
        String rec2 = "Suman";
    }
    
    Thread t1 = new Thread(){
        @Override
        public void run(){
            synchronized (rec1) {
                System.out.println("Thread 1 uses Resource 1"+ rec1);
            }
            synchronized (rec2) {
                System.out.println("Thread 1 uses Resource 1"+ rec2);
            }
            
        }
    };
}
