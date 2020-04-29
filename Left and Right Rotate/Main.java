import java.util.Scanner;
class Main 
{
  public static void rightrot(int arr_size, int arr[])
  {
    int temp;
    if (arr_size%2==0)
      arr_size-=2;
    else
      arr_size-=1;
    temp=arr[arr_size];
    
    for(int i=arr_size;i>1;i-=2)
    {
      
      arr[i]=arr[i-2];
    }
    arr[0]=temp;
  }
  public static void leftrot(int arr_size, int arr[])
  {
    int temp=arr[1];
    for(int i=1;i<arr_size-2;i+=2)
    {
      
      arr[i]=arr[i+2];
    }
    if (arr_size%2==0)
      arr[arr_size-1]=temp;
    else
      arr[arr_size-2]=temp;
  }
  public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++)
      arr[i]=in.nextInt();
    int rot=in.nextInt();
    for(int i=0;i<rot;i++)
    {
      rightrot(arr_size, arr);
      leftrot(arr_size, arr);
    }
    for(int i=0;i<arr_size;i++)
      System.out.print(arr[i]+ " ");
  	}
}