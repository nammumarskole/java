//3.	WAP to display all even natural numbers up-to n

package sheetque;

import java.util.Scanner;

public class que3 
{
     public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of n :");
      int n = sc.nextInt();
      System.out.print("even natural number upto " + n );

      for (int i=2;i<=n;i+=2)
      {
       System.out.println(i + " ");
      }
    }
}
