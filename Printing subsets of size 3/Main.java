import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=in.nextInt();
      for(int i=0;i<=arr_size-2;i++)
      {
        for(int j=i+1;j<=arr_size-1;j++)
        {
          for(int k=j+1;k<=arr_size-1;k++)
            System.out.print("("+arr[i]+", "+arr[j]+", "+arr[k]+")"+" ");
        }
        System.out.print("\n");
      }
    }
}