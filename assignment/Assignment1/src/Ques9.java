/*
9.Write a java program to display your initials on the screen in block letters as shown. For
example the name Tapan Kumar.

*/
public class Ques9 {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=14;j++){
                
                //for row 1 and (row3 for P only)
                if((j==1 || j==2|| j==3|| j==4|| j==5|| j==6)&& (i==1 || i==3)){
                    System.out.print("P");
                }
                if(i==1 && (j==7 || j==8 || j==10 || j==11 || j==12 ||j==13)){
                    System.out.print(" ");
                }
                if(i==1 && (j==9 || j==14)){
                    System.out.print("N");
                }
                
                //for row 2
                if(i==2 && (j==1 || j==6)){
                    System.out.print("P");
                }
                if(i==2 && (j==2 || j==3 || j==4 || j==5 || j==7 || j==8 || j==11 || j==12 || j==13)){
                    System.out.print(" ");
                }
                if(i==2 && (j==9 || j==10 || j==14)){
                    System.out.print("N");
                }
                
                //for row 3
                if(i==3 && (j==7 || j==8 || j==10 || j==12 || j==13)){
                    System.out.print(" ");
                }
                if(i==3 && (j==9 || j==11 || j==14)){
                    System.out.print("N");
                }
                
                //for row 4
                if(i==4 && j==1){
                    System.out.print("P");
                }
                if(i==4 && (j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8 || j==10 || j==11 || j==13 )){
                    System.out.print(" ");
                }
                if(i==4 && (j==9 || j==12 || j==14)){
                    System.out.print("N");
                }
                
                //for row 5
                if(i==5 && j==1){
                    System.out.print("P");
                }
                 if(i==5 && (j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8 || j==10 || j==11 || j==12 )){
                    System.out.print(" ");
                }
                 if(i==5 && (j==9 || j==13 || j==14)){
                    System.out.print("N");
                }
                 
                 //for row 6
                 if(i==6 && j==1){
                    System.out.print("P");
                }
                  if(i==6 && (j==2 || j==3 || j==4 || j==5 || j==6 || j==7 || j==8 || j==10 || j==11 || j==12 || j==13)){
                    System.out.print(" ");
                }
                  if(i==6 && (j==9|| j==14)){
                    System.out.print("N");
                }
            }
            System.out.println();
        }
    }   
}
