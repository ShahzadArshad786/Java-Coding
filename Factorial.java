/* 
   Write a Program using Java that inputs any positive integer and print its factorial 
   using while loop. 
*/
import java.util.*;
class Factorial 
{
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      int num, fact = 1 ; 

      System.out.print("Enter an Positive Number : ");
      num = sc.nextInt();

      int s = 1 ; 
      while(s <= num)
      {
        fact = fact * s ; 
        s = s + 1 ; 
      }

      System.out.print("Factorial of " + num + "! is : " + fact);
      sc.close();
    }
}