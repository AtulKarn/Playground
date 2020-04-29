import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key=in.nextInt();
      int offset=0;
      if (ch>='a' && ch<='z')
      {
        offset=ch-'a';
        offset-=key;
        if (offset<1)
          offset+=26;
        ch=(char)('a'+offset);
        System.out.println(ch);
      }
      else if (ch>='A' && ch<='Z')
      {
        offset=ch-'A';
        offset-=key;
        if (offset<1)
          offset+=26;
        ch=(char)('A'+offset);
        System.out.println(ch);
      }
     
    }
}