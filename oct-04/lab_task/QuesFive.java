import java.util.Scanner;

class QuesFive{
	//fibonacci series
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int start =0,fibo=1,sum=0,n=sc.nextInt();
		for(int i=0;i<=n;i++){
			
			if(i<=1){
				sum =i;
			}
			else{
				sum = start +sum;
				start = fibo;
				fibo=sum;
			}
			System.out.println(sum);
		}
	}
}