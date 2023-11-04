package inner.anonymous;

class ParentOfAnonymous{
    void greeting(){
        System.out.println("Say hello....");
    }
}

class OuterOfAnonymous{
    ParentOfAnonymous p = new ParentOfAnonymous(){
    @Override
        void greeting(){
            System.out.println("Say Namaste");
        }
    }
}

public class TestAnonymous {
    public static void main(String[] args) {
        
    }
}
