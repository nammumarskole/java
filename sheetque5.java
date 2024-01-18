//positive number to binary conversion

import java.util.Scanner;

public class sheetque5 
{
public static void main(String[] args) 
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the decimal number");
   int num = sc.nextInt();

   int index = 0;
   int arr[] = new int[10];

   while (num>0) 
   {
      arr [index] =num%2;
      index++; 
      num = num /2;
   }

   System.out.println("Binary number is ");

   for(int i=index-1;i>=0;i--)
   {
    System.out.print(arr[i]);
   }
   
   
}    
}
