// all positive and negative number is whole number ----------

//2.	WAP to display all whole numbers up-to n

package sheetque;

import java.util.Scanner;

public class que2 
{
 public static void main(String[] args) 
 {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of n :");
      int n = sc.nextInt();
      System.out.print("whol number upto " + n );

      for(int i = -n ;i<=n ;i++)
      {
        System.out.println(i + " ");
      }

 }   
}
