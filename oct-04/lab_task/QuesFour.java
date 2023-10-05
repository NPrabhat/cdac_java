import java.util.Scanner;
class QuesFour{
	//factorial
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int temp=sc.nextInt();
		int fact=1;
		
		for(int i=1; i<=temp;i++){
			fact = fact*i;
		}
			System.out.println(fact);
	}
}