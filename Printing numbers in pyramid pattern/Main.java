import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=1;
      for(int row=1; row<=n; row++)
      {
        for(int space=n-1;space>=row; space--)
          System.out.print(" ");
        for(int colm=1; colm<=row; colm++){
          System.out.print(num+" ");
          num++;}
        
        System.out.print("\n");
      }
    }    
}