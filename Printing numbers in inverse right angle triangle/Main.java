import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int colm=n-row+1;colm>0;colm--)
          System.out.print(colm);
        System.out.print("\n");
      }
	}
}