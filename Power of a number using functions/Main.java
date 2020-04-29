import java.util.Scanner;
class Main{
  public static int power(int base, int exponent)
  {
    int prod=1;
    for(int i = 1; i<=exponent;i++)
      prod*=base;
    return prod;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      System.out.println(power(base, exponent));
	}
}