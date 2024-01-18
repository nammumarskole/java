//4.	WAP to display all odd natural numbers up-to n

package sheetque;

import java.util.Scanner;

public class que4 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of n :");
      int n = sc.nextInt();
      System.out.print("odd natural number upto " + n );

      for (int i=1;i<=n;i+=2)
      {
       System.out.println(i + " ");
      }
    }
}
