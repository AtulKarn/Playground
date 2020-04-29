import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int i, m=n, o=n;
      
      for(i=1;(n/10)!=0;i++)
      {
        n=n/10;
      }
      int j=i, sum=0;
      for(i=0;m!=00;i++)
      {
        sum+= Math.pow((m%10),j);
        m=m/10;
      }
      if (sum==o)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}