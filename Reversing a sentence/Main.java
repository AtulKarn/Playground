import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len= str.length();
        StringBuilder sb = new StringBuilder(str);
        reverse_string(sb, 0, len-1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        String temp1="", temp2="";
        while (0<end_idx)
        {
            
            for (int i=end_idx;((sb.charAt(i)!=' ') && (i>0));--i)
            {
                temp2="";
                if ((sb.charAt(i-1)==' ') || (i==1))
                {
                    if (i==1)
                        {temp2=temp2+sb.substring(i-1,end_idx+1);}
                    else
                        temp2=temp2+sb.substring(i,end_idx+1);
                    temp1=temp1+temp2+' ';
                    end_idx=i-2;
                    if (i==2)
                        temp1=temp1+sb.charAt(0);   
                }   
            }   
        }
        System.out.println(temp1);
    }
}