//Date-09/10/2023
package relation.association;

class Engine{
    private String type;
    
    public Engine(String name){
        this.type = name;
    }
    
    @Override
    public String toString(){
        return type;
    }   
}

class Car{
    private String name;
    private Engine engine;
    
    public Car(String name, Engine engine){
        this.name = name;
        this.engine = new Engine(name);
    }
    
    void carDetails(){
        System.out.println("This is Car details");
        System.out.println("Name: " +name);
        System.out.println("Engine: " +engine);
    }
    
    @Override
    public String toString(){
        return "car maker"+ name + engine.toString();
}

}
public class CarEngine {
    public static void main(String[] args) {
       Car c=new Car("Toyota",new Engine("v8"));
        System.out.println(c.toString());
    }
}
