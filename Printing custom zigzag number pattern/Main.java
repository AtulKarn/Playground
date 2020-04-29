import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int row=1;row<=n;row++)
      {
        if(row%2!=0)
        {
          for(int j=1;j<n;j++)
            System.out.print(row);
          System.out.println(row+1);
        }
        else
        {
          System.out.print(row+1);
          for(int j=1;j<n;j++)
            System.out.print(row);
          System.out.print("\n");
        }
      }
	}
}