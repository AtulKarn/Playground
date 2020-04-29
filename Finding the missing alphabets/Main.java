import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      int len=str.length();
      int strcnt[]=new int[26];
      int offset;
      str=str.toLowerCase();
      for(int i=0;i<26;i++)
          strcnt[i]=0;
      for(int i=0;i<len;i++)
      {
        if (str.charAt(i)>='a' && str.charAt(i)<='z')
        {
          offset=str.charAt(i)-'a';
          strcnt[offset]++;
        }
      }
      for (int i=0;i<26;i++)
      {
        if (strcnt[i]==0)
          System.out.print((char)(i+'a')+" ");
      }
    }
}