import java.util.Scanner;

class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        int totalMarks = 0;
        for(int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        double percent = ((double)totalMarks / 250) * 100;
		System.out.println(percent);
        if (percent >= 90) {
            System.out.println("A+");
        } 
		else if (percent >= 80) {
            System.out.println("A");
        }
		else if(percent >=70){
			System.out.println("B+");
		}
		else if(percent >=60){
			System.out.println("B");
		}
		else if(percent >=50){
			System.out.println("C");
		}
		else if(percent >=40){
			System.out.println("Fail");
		}
		else{
			System.out.println("Fail");
		}
    }
}