package String;

public class StringSorting {
    public static void main(String[] args) {
        String names = "Ramesh,Suresh,Dinesh,Bhavesh,Ganesh";
        String n[] = names.split(",");
        for(String name:n)
            System.out.println(name);
        
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i].compareTo(n[j])>0){
                    String temp;
                    temp =n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("************************Sorted Order************************************");
        for(String name:n)
            System.out.println(name);
    }
    
}
