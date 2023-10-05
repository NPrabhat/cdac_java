import java.util.Scanner;
class QuesThree{
	//palindrome number check
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int palin = sc.nextInt();
		int temp1 =palin,temp2=0,sum=0;
		
		while(temp1!=0)
		{
			temp2 = temp1%10;
			sum = sum*10 + temp2;
			temp1 = temp1/10;
		}
		
		if(palin == sum){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
    }
}