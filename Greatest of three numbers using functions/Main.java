import java.util.Scanner;
class Main{
  public static int greatest(int n1, int n2)
  {
    if (n1>n2)
      return n1;
    else
      return n2;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int temp=greatest(n1,n2);
      temp=greatest(temp,n3);
      System.out.println(temp);
	}
}