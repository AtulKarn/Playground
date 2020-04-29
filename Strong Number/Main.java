import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int sum=0, m=n;
      for (int i=1;n!=0;i++)
      {
        int k=n%10;
        n=n/10;
        int fact=1;
        for (int j=1;j<=k;j++)
          fact*=j;
        sum+=fact;
      }
      if (m==sum)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}