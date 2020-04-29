import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      String str=in.nextLine();
      int len=str.length();
      boolean match=true;
      for(int i=1;i<=len/2;i++)
      {
        if (str.charAt(i-1)!=str.charAt(len-i))
          match=false;
      }
      if (match==true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}