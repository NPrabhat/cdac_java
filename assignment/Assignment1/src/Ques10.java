/*
10.Create an array of integers and initialize it with some values.
i)Calculate the sum and average of the array elements.
ii)Find the maximum and minimum values in the array.
iii)Print the results.
*/


public class Ques10 {
    public static void main(String[] args) {
        int sum=0 ,avg=0,max=0;
        int arr[] = {2,1,3,4,5,7};
        int min = arr[0];
        //(i)for sum and avg
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        avg=sum/arr.length;
        
        //(ii)
        //for max
        for(int number : arr){
            if(number > max){
                max = number;
            }
        }
        
        //for min
        for(int number : arr){
            if(number < min){
                min = number;
            }
        }
        
        System.out.println("Sum of array is "+sum);
        System.out.println("Average of array is "+avg);
        System.out.println("Maximum number of array is "+max);
        System.out.println("Minimum number of array is "+min);
        
    }
}
