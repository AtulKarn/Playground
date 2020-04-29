import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
      arr[i]=in.nextInt();
    int arr0[]=new int[arr_size], j=0;
    for(int i=0;i<arr_size;i++)
    {
      if (arr[i]!=0)
      {
        arr0[j]=arr[i];
        j++;
      }
    }
      for(int i=0;i<arr_size;i++)
      System.out.print(arr0[i]+" ");
    }
}