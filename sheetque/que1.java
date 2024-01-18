// all positive integer is natural number ---------

// 1.	WAP to display all natural numbers up-to n
package sheetque;
import java.util.Scanner;;
public class que1 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of n :");
      int n = sc.nextInt();
      System.out.print("natural number upto " + n + ":");
  
      for (int i = 0;i<=n ;i++)
      {
          System.out.println(i + " ");
      }
    }     
}
