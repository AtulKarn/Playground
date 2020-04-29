import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
    int sum[]=new int[n/3], j=0;
    for (int i=0;i<n/3;i++)
    {
      sum[i]=arr[j]+arr[j+1]+arr[j+2];
      j=j+3;
    }
    int temp=sum[0], cse=1;
    for(int i=1;i<n/3;i++)
    {if (temp!=sum[i])
        cse=0;}
    if (cse==1)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}