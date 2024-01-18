
//negative number to binary conversion

import java.util.Scanner;

public class sheetque6 
{

        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter decimal number");
            int decimalNumber = sc.nextInt(); 
    
           // System.out.println("Decimal Number: " + decimalNumber);
            System.out.println("Binary Representation: " + convertToBinary(decimalNumber));
        }
        private static String convertToBinary(int decimalNumber)
         {
            
            String positiveBinary = Integer.toBinaryString(Math.abs(decimalNumber));
    
           
            int numBits = Integer.SIZE - Integer.numberOfLeadingZeros(Math.abs(decimalNumber));
    
            
            int mask = (1 << numBits) - 1;
    
            
            int twosComplement = Integer.parseInt(positiveBinary, 2) ^ mask;
    
            
            String binaryString = Integer.toBinaryString(twosComplement);
            return String.format("%" + numBits + "s", binaryString).replace(' ', '0');
        }
    }
    
