/* 
   Write a Java Program that inputs a Positive Number and Reverse it. For 
   Example if the user enters 2765, the function should reverse it so that 
   it becomes 5672.  
*/

import java.util.*; 
public class ReverseNumberUsingLoop
{
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter an Positive Number : ");
   int num = sc.nextInt();

   int rev = 0 ; 
   int digit ; 
   
   System.out.print("\nOriginal Number is : " + num + "\n\n");
      
   for ( int i = num ; i != 0 ; i = i / 10) 
   {
      digit = i % 10 ;
      rev = (rev * 10 ) + digit ; 
   }
 
   System.out.println("Reverse Number is  : " + rev); 

   sc.close();

	}
}