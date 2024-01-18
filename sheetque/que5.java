
//5.	WAP to display all numbers between two given range
package sheetque;

import java.util.Scanner;

public class que5 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("enter the first number");
    int x = sc.nextInt();

    System.out.print("Enter the second number");
    int y = sc.nextInt();

    for(int i=x;i<=y;i++)
    {
        System.out.println(i+ " ");
    }
  }  
}
