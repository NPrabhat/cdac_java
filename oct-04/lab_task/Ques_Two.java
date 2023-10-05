import java.util.Scanner;

class Ques_Two{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i= sc.nextInt();
		
		if(i%8==0 && i%5==0){
			System.out.println(i + " Divisible by 8 & 5");
		}
		else if(i%8==0){
			System.out.println(i + " DIvisible by 8 only");
		}
		else if(i%5==0){
			System.out.println(i + " DIvisible by 5 only");
		}
		else{
			System.out.println(i + " Not DIvisible");
		}
	}
}