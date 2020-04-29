import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String str= in.nextLine();
      int len=str.length();
      int strcnt[]=new int[26], strcnt2[]=new int[26];
      int offset;
      str=str.toLowerCase();
      for(int i=0;i<26;i++)
        {
          strcnt[i]=0;
          strcnt2[i]=0;
            
        }
      for(int i=0;i<len;i++)
      {
          offset=str.charAt(i)-'a';
          strcnt[offset]++;
          strcnt2[offset]++;
      }
      StringBuilder str2= new StringBuilder();
      for(int i=0;i<len;i++)
      {
        offset=str.charAt(i)-'a';
         if (strcnt2[offset]!=0)
            {
              str2.append(str.charAt(i));
              strcnt2[offset]=0;
            }
      }
      for(int i=0;i<str2.length();i++)
      {
          offset=str2.charAt(i)-'a';
          System.out.print(str2.charAt(i));
          System.out.print(strcnt[offset]+" ");
      }
    }
}