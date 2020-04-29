import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
        System.out.print("*");
      System.out.print("\n");
      for(int i=3;i<=n;i++)
      {
        System.out.print("*");
        for(int j=3;j<=n;j++)
          System.out.print(" ");
        System.out.print("*\n");
      }
      for(int i=1;i<=n;i++)
        System.out.print("*");
	}
}