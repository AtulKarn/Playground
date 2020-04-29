import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int len=str1.length();
      str1=str1.concat(str1);
      int flag=0;
      for(int i=0;i<len;i++)
      {
        if (str2.equals(str1.substring(i,i+len)))
        {
          flag=1;
          break;
        }
      }
      if (flag==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}