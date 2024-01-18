import java.util.Scanner;

public class arrayinput 
{
 public static void main(String[] args) 
 {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the size of an array");
    // int size = sc.nextInt();
    
    // // creat of empty array object 
    // int [] arr = new int[size];
    // //input elemrnt inside an array 
    
    // for(int i=0;i<size;i++)
    // {
    //    System.out.println("Enter the element");
    //    arr[i] = sc.nextInt();
    // }

    // // display array element 
    // for(int a : arr)
    // {
    //     System.out.println(a);
    // }

//   -------------------using float-------------------------

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the size of an array");
    // int size = sc.nextInt();
    
    // // creat of empty array object 
    // float [] arr = new float[size];
    // //input elemrnt inside an array 
    
    // for(int i=0;i<size;i++)
    // {
    //    System.out.println("Enter the element");
    //    arr[i] = sc.nextFloat();
    // }

    // // display array element 
    // for(float a : arr)
    // {
    //     System.out.println(a);
    // }

// --------------------------------String--------------------------

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();
    
    // creat of empty array object 
    String [] arr = new String[size];
    //input elemrnt inside an array 
    
    for(int i=0;i<size;i++)
    {
       System.out.println("Enter the element");
       sc.nextLine();
       arr[i] = sc.nextLine();
    }

    // display array element 
    for(String a : arr)
    {
        System.out.println(a);
    }


//  ----------------------------double---------------------

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of an array");
// int size = sc.nextInt();

// // creat of empty array object 
// double [] arr = new double[size];
// //input elemrnt inside an array 

// for(int i=0;i<size;i++)
// {
//    System.out.println("Enter the element");
//    arr[i] = sc.nextDouble();
// }

// // display array element 
// for(double a : arr)
// {
//     System.out.println(a);
// }


 }   
}
