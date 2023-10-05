import java.util.Scanner;
class IfElse{	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		if(i>j){
			System.out.println("i is grater" + i);
		}
		else{
			System.out.println("j is greater" + j);
		}
	}
}