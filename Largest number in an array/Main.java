import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int arr_size=in.nextInt();
      int array[]= new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        array[i]=in.nextInt();
      }
      int temp=array[0];
      for(int i=0;i<arr_size;i++)
      {
        if (array[i]>temp)
          temp=array[i];
      }
      System.out.println(temp);
    }
}