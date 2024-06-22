/* 
    Write a Java Program that inputs a Positive Number and Reverse it. Write a function Reverse () 
    to reverse the number. For Example if the user enters 2765, the function should reverse it so that 
    it becomes 5672. The Reverse () function should accept the number as an input parameter and return 
    the reverse number.
*/
import java.util.*;
public class ReverseNumberUsingFunction {
   
static int Reverse(int n)
{
    int rev = 0 ; 
    int digit ; 
    System.out.print("\nOriginal Number is : " + n + "\n\n");
     
  for( int i = n ; i != 0 ; i = i / 10) 
  {
     digit = i % 10 ;
     rev = (rev * 10 ) + digit ; 
  }
  
  return rev ; 
 
}
public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any Number : ");
    int num = sc.nextInt();

    System.out.println("Reverse Number is  : " + (Reverse(num))); 
    sc.close();
    }
}
