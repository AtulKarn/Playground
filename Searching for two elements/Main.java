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
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int pos_1=-1, pos_2=-1;
      for(int i=0;i<arr_size;i++)
      {
        if (array[i]==search_elem_1)
          pos_1=i;
        else if(array[i]==search_elem_2)
          pos_2=i;
      }
      System.out.println(pos_1);
      System.out.println(pos_2);
    }
}