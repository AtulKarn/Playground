import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String replace = in.nextLine();
      String replacewith = in.nextLine();
      str1=str1.replace(replace, replacewith);
      System.out.println(str1);
      
    }
}