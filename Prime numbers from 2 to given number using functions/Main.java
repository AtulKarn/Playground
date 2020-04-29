import java.util.Scanner;
class Main{
  public static int prime(int n)
  {
    int check=1;
    for(int i=2;i<=n/2;i++)
    {
      if (n%i==0)
      {check=0;
       break;
      }
    }
    return check;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2;i<=n;i++)
      {if (prime(i)==1)
          System.out.println(i);
	}}
}