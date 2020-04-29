import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int row = in.nextInt();
    int clm = in.nextInt();
    int mat1[][] = new int[row][clm], mat2[][] = new int[row][clm];
    for (int i=0;i<row;i++)
      for (int j=0;j<clm;j++)
        mat1[i][j]=in.nextInt();
    for (int i=0;i<row;i++)
      for (int j=0;j<clm;j++)
        mat2[i][j]=in.nextInt();
    for (int i=0;i<row;i++)
      for (int j=0;j<clm;j++)
        mat1[i][j]=mat1[i][j]-mat2[i][j];
    for (int i=0;i<row;i++)
    {for (int j=0;j<clm;j++)
        System.out.print(mat1[i][j]+ " ");
      System.out.println();
    }
    
    
    
  }
}