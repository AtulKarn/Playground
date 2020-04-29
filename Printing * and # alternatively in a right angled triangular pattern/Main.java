import java.util.Scanner;

class Main
{

  public static void main (String[]args)
  {

    Scanner in = new Scanner (System.in);

    // Type your code here
    int n = in.nextInt ();
      System.out.println ("*");
    int k = 0;
      n -= 1;


    for (int i = 2; i <= n; i++)

      {

	for (int j = 1; j <= i; j++)

	  {

	    if (k % 2 == 0)

	      {

		if (j % 2 == 0)

		  System.out.print ("*");

		else

		  System.out.print ("#");

	      }

	    else

	      {

		if (j % 2 == 0)

		  System.out.print ("#");

		else

		  System.out.print ("*");

	      }

	  }

	System.out.print ("\n");

	for (int j = 1; j <= i + 1; j++)

	  {

	    if (k % 2 == 0)

	      {

		if (j % 2 == 0)

		  System.out.print ("*");

		else

		  System.out.print ("#");

	      }

	    else

	      {

		if (j % 2 == 0)

		  System.out.print ("#");

		else

		  System.out.print ("*");

	      }

	  }

	System.out.print ("\n");
	k++;
	i++;

      }
    if (n % 2 != 0)
      {
	for (int j = 1; j <= n + 1; j++)

	  {

	    if (k % 2 == 0)

	      {

		if (j % 2 == 0)

		  System.out.print ("*");

		else

		  System.out.print ("#");

	      }

	    else

	      {

		if (j % 2 == 0)

		  System.out.print ("#");

		else

		  System.out.print ("*");

	      }

	  }
      }
  }

}
