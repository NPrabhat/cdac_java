/*
Q1. Write a Java program that declares an array of integers and tries to access an
element at an index beyond the array’s length. Handle the
ArrayIndexOutOfBoundsException by providing a meaningful message.
*/



public class Ques1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
            arr[7] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The program is giving exception because of " + e.getMessage());
        }
    }
}
