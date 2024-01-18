// 7.	WAP to find all odd numbers between two given range

package sheetque;

import java.util.Scanner;

public class que7 
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
       if(i%2 != 0)
       {
        System.out.println(i+ " ");
       }

    }

  }  
}
