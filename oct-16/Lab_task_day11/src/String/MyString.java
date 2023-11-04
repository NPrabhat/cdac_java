/*
1.Create MyString class and perform different string manipulation methods
*/
package String;

public class MyString {
    public static void main(String[] args) {
        String s = "Soft Polynomials";
        String s1 = new String("Soft Polynomials");
        
//        int x = s.indexOf(s1);
//        System.out.println(x);    

        int x = s.indexOf('a');
        int x1 = s.indexOf('o',3);
        int y =s.lastIndexOf('o');
        char y1 = s.charAt(5);
        String z[] = s.split(" ");
        char z1[] = s.toCharArray();
        System.out.println(x+"\n"+x1+"\n"+y+"\n"+y1+"\n"+z[1]+"\n"+z1[5]);
        
        String s2 = " ";
        boolean b = s2.isEmpty();
        boolean b1 = s2.isBlank();
        System.out.println(b+ "\n"+ b1);
        
        String s3 = "Anup";
        String s4 = "Prabhat";
        System.out.println(s3.compareTo(s4));
    }
}
