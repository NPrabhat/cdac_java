import java.util.Scanner;
class JaggedDemo{
	
	int arr[][] = new int[3][];
	
	void takeInput(){
		arr[0] = new int[5];
		arr[1] = new int[2];
		arr[2] = new int[4];
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+ (arr[0].length + arr[1].length + arr[2].length)+ "nos");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	void showOutput(){
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		JaggedDemo jd = new JaggedDemo();
		jd.takeInput();
		System.out.println("Output");
		jd.showOutput();
	}
	
}