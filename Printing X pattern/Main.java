import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int row=1;row<=n/2;row++)
      {
        for(int space=1;space<row;space++)
          System.out.print(" ");
        System.out.print("*");
        for (int space=1;space<n-(2*row-1);space++)
          System.out.print(" ");
        System.out.print("*\n");
      }
      for(int i=1;i<n/2+1;i++)
        System.out.print(" ");
      System.out.println("*");
      for(int row=1;row<=n/2;row++)
      {
        for(int space=1;space<=n/2-row;space++)
          System.out.print(" ");
        System.out.print("*");
        for (int space=1;space<=2*row-1;space++)
          System.out.print(" ");
        System.out.print("*\n");
      }
	}
}