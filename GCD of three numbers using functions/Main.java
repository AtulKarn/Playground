import java.util.Scanner;
class Main{
  public static int gcd(int n1, int n2)
  {
    int gcd=1, min;
    if (n1>n2)
      min=n1;
    else
      min = n2;
    while (min>=1)
    {
      if ((n1%min==0) && (n2%min==0))
          {gcd = min;
          break;
          }
      min--;     
    }
    return gcd;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int temp=gcd(n1,n2);
      temp=gcd(temp,n3);
      System.out.println(temp);
	}
}