import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      int m=n;
      int sum = n%10;
      while(n>0)
      {
         count*=10;
        n/=10;
      }
      count = count/100;
      System.out.println((m/count)%10);
    }
}